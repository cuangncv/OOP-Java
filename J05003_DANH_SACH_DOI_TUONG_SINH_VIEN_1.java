package dsdtsv;

import java.util.ArrayList;
import java.util.Scanner;

public class J05003_DANH_SACH_DOI_TUONG_SINH_VIEN_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i<= t; i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
            sv.setNgaysinh();
            lt.add(sv);
        }
        for(SinhVien s : lt){
            System.out.println(s);
        }
    }
}
class SinhVien {
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
    @Override
    public String toString(){
        return ma + " " + hoten + " " +  lop + " " + ngaysinh + " " + String.format("%.2f",gpa);
    }
}
