package danhsachdoituongnhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> lt = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            NhanVien nv = new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(nv);
        }
        for(NhanVien q : lt){
            System.out.println(q);
        }
        in.close();
    }
}
class NhanVien {
    private String ma, ten, gioitinh, ngaysinh, diachi, masothue, ngayky;

    public NhanVien (int i, String ten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngayky){
        this.ma = String.format("%05d", i);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayky = ngayky;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", ma, ten, gioitinh, ngaysinh, diachi, masothue, ngayky);
    }
}