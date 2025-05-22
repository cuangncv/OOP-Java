package danhsachdtsvbaisoba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05005_DANH_SACH_DOI_TUONG_SINH_VIEN_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i<= t; i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
            sv.setNgaysinh();
            sv.setHoten();
            lt.add(sv);
        }
        Collections.sort(lt);
        for(SinhVien s : lt){
            System.out.println(s);
        }
    }
}
class SinhVien implements Comparable<SinhVien> {
    private String ma, hoten, lop, ngaysinh;
    private double gpa;
    public SinhVien(int i, String hoten, String lop, String ngaysinh, double gpa){
        this.ma = String.format("B20DCCN0%02d",i);
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gpa = gpa;
    }
    public void setNgaysinh(){
        String [] a = ngaysinh.split("/");
        String ngay = String.format("%02d", Integer.parseInt(a[0])); // Đảm bảo ngày có 2 chữ số
        String thang = String.format("%02d", Integer.parseInt(a[1])); // Đảm bảo tháng có 2 chữ số
        String nam = a[2]; // Năm không cần thay đổi
        ngaysinh = ngay + "/" + thang + "/" + nam;
    }
    public void setHoten(){
        String [] b = hoten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.length; i++){
            sb.append(b[i].substring(0,1).toUpperCase() + b[i].substring(1).toLowerCase()+ " ");
        }
        hoten = sb.toString();
    }
    @Override
    public String toString(){
        return ma + " " + hoten + " " +  lop + " " + ngaysinh + " " + String.format("%.2f",gpa);
    }
    public int compareTo(SinhVien other){
        return Double.compare(other.gpa, this.gpa);
    }
}
