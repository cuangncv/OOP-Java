package sxdsachsv;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07081_SAP_XEP_DANH_SACH_SINH_VIEN {
    public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            sv.setHoten();
            ds.add(sv);
        }
        Collections.sort(ds);
        for(SinhVien tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}
class SinhVien implements Comparable<SinhVien> {
    private String ma, hoten, sdt, email;
    private String ten, ho , tendem;
    public SinhVien(String ma, String hoten, String sdt, String email){
        this.ma = ma;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
    }
    public void setHoten (){
        String [] a = hoten.trim().split("\\s+");
        ho = a[0];
        ten = a[a.length - 1];
        if(a.length > 2){
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < a.length - 1; i++){
                sb.append(a[i] + " ");
            }
            tendem = sb.toString();
        }
        else tendem = "";
    }

    @Override
    public String toString(){
        return ma + " " + hoten + " " + sdt + " " + email;
    }

    @Override
    public int compareTo(SinhVien other){
        if(this.ten.equals(other.ten)){
            if(this.ho.equals(other.ho)){
                if(this.tendem.equals(other.tendem)){
                    return this.ma.compareTo(other.ma);
                }
                return this.tendem.compareTo(other.tendem);
            }
            return this.ho.compareTo(other.ho);
        }
        return this.ten.compareTo(other.ten);
    }
}

