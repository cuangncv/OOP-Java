package hoadon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang> {
    private String maKH, tenKH;
    private int chiSoCu, chiSoMoi;
    private double tongTien;

    public KhachHang(int i, String tenKH, int chiSoCu, int chiSoMoi) {
        this.maKH = String.format("KH%02d", i);
        this.tenKH = tenKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public void setTongTien() {
        int soNuoc = chiSoMoi - chiSoCu;
        if (soNuoc <= 50) {
            tongTien =  (soNuoc * 100) * 102 / 100.0;
        } else if (soNuoc <= 100) {
            tongTien =  (50 * 100 + (soNuoc - 50) * 150) * 103 / 100.0;
        } else {
            tongTien = (50 * 100 + 50 * 150 + (soNuoc - 100) * 200) * 105 / 100.0;
        }
    }

    public int compareTo(KhachHang other) {
        return Double.compare(other.tongTien, this.tongTien);
    }

    public String toString() {
        return maKH + " " + tenKH + " " + Math.round(tongTien);
    }
}

public class J05017_Hoa_don_tien_nuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tenKH = sc.nextLine();
            int chiSoCu = Integer.parseInt(sc.nextLine());
            int chiSoMoi = Integer.parseInt(sc.nextLine());
            KhachHang kh = new KhachHang(i + 1, tenKH, chiSoCu, chiSoMoi);
            kh.setTongTien();
            dsKH.add(kh);
        }
        Collections.sort(dsKH);
        for (KhachHang kh : dsKH) {
            System.out.println(kh);
        }
    }
}
