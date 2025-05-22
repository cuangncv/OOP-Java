package thuctap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034_DANH_SACH_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(sv);
        }
        Collections.sort(lt);
        ArrayList<String> arr = new ArrayList<>();
        int q = Integer.parseInt(in.nextLine());
        for(int i = 0; i < q; i++){
            arr.add(in.nextLine());
        }
        for(String x : arr){
            for(SinhVien s : lt){
                if(s.getDoanhnghiep().equals(x)){
                    System.out.println(s);
                }
            }
        }
        in.close();
    }
}
class SinhVien implements Comparable<SinhVien>{
    private String msv, hoten, lop, email, doanhnghiep;
    private int stt;
    public SinhVien (int stt, String msv, String hoten, String lop, String email, String doanhnghiep){
        this.stt = stt;
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
        this.doanhnghiep = doanhnghiep;
    }
    public String getDoanhnghiep(){
        return doanhnghiep;
    }
    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", stt, msv, hoten, lop, email, doanhnghiep);
    }
    public int compareTo(SinhVien other){
        return this.hoten.compareTo(other.hoten);
    }
}
