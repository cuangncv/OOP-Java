package sinhvienptit;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07054_TINH_DIEM_TRUNG_BINH {
    public static void main(String[] args) throws Exception{
        Scanner in  = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            SinhVien sv = new SinhVien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            lt.add(sv);
        }
        Collections.sort(lt);
        int rank = 1;
        for (int i = 0; i < lt.size(); i++) {
            if (i > 0 && lt.get(i).getDiemTrungBinh() != lt.get(i - 1).getDiemTrungBinh()) {
                rank = i + 1;
            }
            System.out.println(lt.get(i) + " " + rank);
        }
    }
}
class SinhVien implements Comparable<SinhVien>{
    private String ten, ma;
    private double diemtb;

    public SinhVien(int i, String ten, int diem1, int diem2, int diem3){
        this.ma = String.format("SV%02d", i);
        setTen(ten);
        this.diemtb = (3 * diem1 + 3 * diem2 + 2 * diem3) / 8.0 ;
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
    public int compareTo(SinhVien other){
        if(this.diemtb == other.diemtb){
            return this.ma.compareTo(other.ma);
        }
        return Double.compare(other.diemtb, this.diemtb);
    }
    @Override
    public String toString(){
        return ma + " " + ten + String.format("%.2f",Math.round(diemtb * 100) / 100.0) ;
    }
}
