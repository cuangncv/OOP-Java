package hs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018_BANG_DIEM_HOC_SINH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<HocSinh> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            HocSinh hs = new HocSinh(i, in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
            hs.setXeploai();
            in.nextLine();
            lt.add(hs);
        }
        Collections.sort(lt);
        for(HocSinh h : lt){
            System.out.println(h);
        }
    }
}
class HocSinh implements Comparable<HocSinh>{
    private String hoten, ma, xeploai;
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, diemtb;
    public HocSinh(int i, String hoten, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10){
        this.ma = String.format("HS%02d", i);
        this.hoten = hoten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
        this.diemtb = ((d1 + d2) *2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / 12;
        this.diemtb = Math.round(this.diemtb * 10.0) / 10.0;
    }

    public void setXeploai() {
        if(diemtb >= 9) xeploai = "XUAT SAC";
        else if(diemtb >=8) xeploai = "GIOI";
        else if(diemtb >=7) xeploai = "KHA";
        else if(diemtb >=5) xeploai = "TB";
        else xeploai = "YEU";
    }
    @Override
    public String toString(){
        return String.format("%s %s %.1f %s", ma, hoten, diemtb, xeploai);
    }
    public int compareTo(HocSinh other){
        if(this.diemtb == other.diemtb) return this.ma.compareTo(other.ma);
        return Double.compare(other.diemtb, this.diemtb);
    }
}