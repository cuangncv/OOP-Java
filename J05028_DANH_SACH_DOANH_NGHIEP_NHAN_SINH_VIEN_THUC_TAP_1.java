package dn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<DoanhNghiep> al = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            DoanhNghiep dn = new DoanhNghiep(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            al.add(dn);
        }
        Collections.sort(al);
        for(DoanhNghiep d : al){
            System.out.println(d);
        }
        in.close();
    }
}
class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten;
    private int sosv;
    public DoanhNghiep(String ma, String ten, int sosv){
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }
    @Override
    public int compareTo(DoanhNghiep other){
        if(this.sosv == other.sosv){
            return this.ma.compareTo(other.ma);
        }
        return Integer.compare(other.sosv, this.sosv);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + sosv;
    }
}
