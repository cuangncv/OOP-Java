package ksxyz;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07051_TINH_TIEN_PHONG {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> lt = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            KhachHang kh = new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            lt.add(kh);
        }
        Collections.sort(lt);
        for(KhachHang p : lt){
            System.out.println(p);
        }
        in.close();
    }
}

class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, soPhong;
    private long soNgayO, tien;

    public KhachHang(int i, String ten, String soPhong, String ngayNhan, String ngayTra, long phatSinh){
        this.ma = String.format("KH%02d", i);
        setTen(ten);
        this.soPhong = soPhong;
        setSoNgayO(ngayNhan, ngayTra);
        setTien(this.soPhong, phatSinh);
    }

    private void setTen(String ten){
        String [] a = ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            sb.append(a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ");
        }
        this.ten = sb.toString();
    }
    private String chuanHoa (String ngay){
        String [] a = ngay.trim().split("/");
        if(a[0].length() != 2) a[0] = "0" + a[0];
        if(a[1].length() != 2) a[1] = "0" + a[1];
        StringBuilder sb = new StringBuilder();
        sb.append(a[0] + "/" + a[1] + "/" + a[2]);
        return sb.toString();
    }
    private void setSoNgayO(String a, String b){
        a = chuanHoa(a);
        b = chuanHoa(b);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate x = LocalDate.parse(a,dtf);
        LocalDate y= LocalDate.parse(b,dtf);
        this.soNgayO = ChronoUnit.DAYS.between(x,y) + 1;
    }
    private void setTien(String soPhong, long phatSinh){
        long money = 0;
        String m =soPhong.substring(0,1);
        if(m.equals("1")) money = this.soNgayO * 25;
        if(m.equals("2")) money = this.soNgayO * 34;
        if(m.equals("3")) money = this.soNgayO * 50;
        if(m.equals("4")) money = this.soNgayO * 80;
        this.tien = money + phatSinh;
    }

    @Override
    public String toString(){
        return ma + " " + ten + soPhong + " " + soNgayO + " " + tien;
    }
    public int compareTo(KhachHang other){
        return Long.compare(other.tien, this.tien);
    }
}
