package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    private String maSp, tenSp;
    private int thoiHanBaoHanh, giaBan;

    public SanPham(String maSp, String tenSp, int giaBan, int thoiHanBaoHanh) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getMaSp() {
        return maSp;
    }

    public LocalDate ngayHetHanBaoHanh(LocalDate ngayMua) {
        return ngayMua.plusMonths(thoiHanBaoHanh);
    }

    public int getGiaBan() {
        return giaBan;
    }
}

class KhachHang {
    private String maKH, tenKH, diaChi, maSP;
    private int soLuong;
    private LocalDate ngayMua;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public KhachHang(int i, String ten, String diaChi, String maSP, int soLuong, String ngayMua) {
        this.maKH = String.format("KH%02d", i);
        this.tenKH = ten;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ngayMua = LocalDate.parse(ngayMua, formatter);
    }

    public String getMaSP() {
        return maSP;
    }

    public LocalDate tinhNgayHetHan(SanPham sanPham) {
        return sanPham.ngayHetHanBaoHanh(ngayMua);
    }

    // Tính tổng số tiền cần thanh toán
    public int tongTien(SanPham sanPham) {
        return sanPham.getGiaBan() * soLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public LocalDate getNgayHetHan(SanPham sanPham) {
        return tinhNgayHetHan(sanPham);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %s", maKH, tenKH, diaChi, maSP, tongTien(null), getNgayHetHan(null).format(formatter));
    }
}

public class demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = Integer.parseInt(in.nextLine()); // Số lượng sản phẩm
        ArrayList<SanPham> lt1 = new ArrayList<>();

        // Đọc thông tin sản phẩm
        for (int i = 1; i <= t1; i++) {
            SanPham sp = new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            lt1.add(sp);
        }

        int t2 = Integer.parseInt(in.nextLine()); // Số lượng khách hàng
        ArrayList<KhachHang> lt2 = new ArrayList<>();

        // Đọc thông tin khách hàng và tạo đối tượng KhachHang
        for (int i = 1; i <= t2; i++) {
            KhachHang kh = new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), in.nextLine());
            lt2.add(kh);
        }
        Collections.sort(lt2, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang kh1, KhachHang kh2) {
                // Tìm sản phẩm của khách hàng để tính ngày hết hạn bảo hành
                SanPham sp1 = null, sp2 = null;
                for (SanPham sp : lt1) {
                    if (sp.getMaSp().equals(kh1.getMaSP())) {
                        sp1 = sp;
                    }
                    if (sp.getMaSp().equals(kh2.getMaSP())) {
                        sp2 = sp;
                    }
                }
                LocalDate hetHan1 = kh1.getNgayHetHan(sp1);
                LocalDate hetHan2 = kh2.getNgayHetHan(sp2);

                int dateCompare = hetHan1.compareTo(hetHan2);
                if (dateCompare != 0) {
                    return dateCompare;
                }
                return kh1.getMaKH().compareTo(kh2.getMaKH());
            }
        });
        for (KhachHang kh : lt2) {
            SanPham sp = null;
            for (SanPham product : lt1) {
                if (product.getMaSp().equals(kh.getMaSP())) {
                    sp = product;
                    break;
                }
            }
            LocalDate hetHan = kh.getNgayHetHan(sp);
            System.out.printf("%s %s %s %s %d %s%n", kh.getMaKH(), kh.getTenKH(), kh.getDiaChi(), kh.getMaSP(), kh.tongTien(sp), hetHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        in.close();
    }
}
