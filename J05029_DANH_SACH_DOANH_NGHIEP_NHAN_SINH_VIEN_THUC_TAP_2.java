package doanhnghiep2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<DoanhNghiep> al = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            DoanhNghiep dn = new DoanhNghiep(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            al.add(dn);
        }
        Collections.sort(al);
        int q = Integer.parseInt(in.nextLine());
        int [] a = new int[q];
        int [] b = new int[q];
        for(int i = 0; i < q; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        for(int i = 0; i < q; i++){
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:%n", a[i], b[i]);
            for(DoanhNghiep d : al){
                if(d.getSosv() >= a[i] && d.getSosv() <= b[i]){
                    System.out.println(d);
                }
            }
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
    public int getSosv(){
        return sosv;
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
