package sxmsv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05021_SAP_XEP_THEO_MA_SINH_VIEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(sv);
        }
        Collections.sort(lt);
        for(SinhVien s : lt){
            System.out.println(s);
        }
    }
}
class SinhVien implements Comparable<SinhVien>{
    private String msv, hoten, lop, email;

    public SinhVien(String msv, String hoten, String lop, String email){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public String toString(){
        return msv + " " + hoten + " " + lop + " " + email;
    }
    @Override
    public int compareTo(SinhVien other){
        return this.lop.compareTo(other.lop);
    }
}
