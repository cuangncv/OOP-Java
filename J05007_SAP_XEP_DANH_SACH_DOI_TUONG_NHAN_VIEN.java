package doituongnhanvien;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            NhanVien nv = new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            arr.add(nv);
        }
        Collections.sort(arr);
        for(NhanVien a : arr){
            System.out.println(a);
        }
        in.close();
    }
}
class NhanVien implements Comparable<NhanVien>{
    private String ma, ten, gioitinh, diachi, mst, kyhd;
    private LocalDate ngaysinh;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public NhanVien (int i, String ten, String gioitinh, String ns, String diachi, String mst, String kyhd){
        this.ma = String.format("%05d",i);
        this.ten = ten;
        this.gioitinh = gioitinh;
        setNgaysinh(ns);
        this.diachi = diachi;
        this.mst = mst;
        this.kyhd = kyhd;
    }
    public void setNgaysinh(String ns){
        this.ngaysinh = LocalDate.parse(ns, dtf);
    }
    public int compareTo(NhanVien other){
        return this.ngaysinh.compareTo(other.ngaysinh);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + gioitinh + " " + ngaysinh.format(dtf) + " " + diachi + " " + mst + " " + kyhd;
    }
}
