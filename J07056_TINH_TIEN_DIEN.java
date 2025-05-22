package tinhtiendien;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07056_TINH_TIEN_DIEN {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            KhachHang kh = new KhachHang(i, in.nextLine(), in.next(), in.nextInt(), in.nextInt());
            in.nextLine();
            lt.add(kh);
        }
        Collections.sort(lt);
        for(KhachHang k : lt){
            System.out.println(k);
        }
        in.close();
    }
}
class KhachHang implements Comparable<KhachHang>{
    private String ma, ten;
    private int tienTrong, tienVuot, thueVAT, tongTien;

    public KhachHang(int i, String ten, String x, int soDau, int soCuoi){
        this.ma = String.format("KH%02d", i);
        setTen(ten);
        setTien(x,soDau, soCuoi);
    }

    private void setTen(String ten){
        String [] a = ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i ++){
            sb.append(a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ");
        }
        this.ten = sb.toString();
    }

    private void setTien(String x, int soDau, int soCuoi){
        int dinhMuc = 0;
        if(x.equals("A")) dinhMuc = 100;
        else if(x.equals("B")) dinhMuc = 500;
        else dinhMuc = 200;
        if(dinhMuc >= (soCuoi - soDau)){
            this.tienTrong = (soCuoi - soDau) * 450;
            this.tienVuot = 0;
            this.thueVAT = 0;
        }
        else {
            this.tienTrong = dinhMuc * 450;
            this.tienVuot = (soCuoi - soDau - dinhMuc)*1000;
            this.thueVAT = tienVuot * 5 / 100;
        }
        this.tongTien = tienTrong + tienVuot + thueVAT;
    }

    public int compareTo(KhachHang other){
        return Integer.compare(other.tongTien, this.tongTien);
    }
    public String toString(){
        return ma + " " + ten + tienTrong + " " +tienVuot + " " + thueVAT + " " + tongTien;
    }
}