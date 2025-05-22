package xloai;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07055_XEP_LOAI {
    public static void main(String[] args) throws Exception{
        Scanner in  = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            lt.add(sv);
        }
        Collections.sort(lt);
        for (SinhVien s : lt){
            System.out.println(s);
        }
    }
}
class SinhVien implements Comparable<SinhVien>{
    private String ten, ma, xeploai;
    private double diemtb;

    public SinhVien(int i, String ten, int diem1, int diem2, int diem3){
        this.ma = String.format("SV%02d", i);
        setTen(ten);
        this.diemtb = (25 * diem1 + 35 * diem2 + 40 * diem3) / 100.0 ;
        setXeploai();
    }

    public double getDiemTrungBinh(){
        return diemtb;
    }

    private void setTen(String ten){
        String [] a = ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i ++){
            sb.append(a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ");
        }
        this.ten = sb.toString();
    }

    private void setXeploai(){
        if(diemtb >= 8) xeploai = "GIOI";
        else if(diemtb >= 6.5) xeploai = "KHA";
        else if(diemtb >= 5) xeploai = "TRUNG BINH";
        else xeploai = "KEM";
    }
    public int compareTo(SinhVien other){
        return Double.compare(other.diemtb, this.diemtb);
    }
    @Override
    public String toString(){
        return ma + " " + ten + String.format("%.2f",Math.round(diemtb * 100) / 100.0) + " " + xeploai ;
    }
}
