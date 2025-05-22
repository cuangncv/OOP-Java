package sxdsgv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025_SAP_XEP_DANH_SACH_GIANG_VIEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<GiangVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            GiangVien gv = new GiangVien (i, in.nextLine(), in.nextLine());
            gv.setTen();
            gv.setBomon();
            lt.add(gv);
        }
        Collections.sort(lt);
        for(GiangVien g : lt){
            System.out.println(g);
        }
        in.close();
    }
}
class GiangVien implements Comparable<GiangVien>{
    private String ma,hoten ,ten, bomon;

    public GiangVien (int i, String hoten, String bomon){
        this.ma = String.format("GV%02d",i);
        this.hoten = hoten;
        this.bomon = bomon;
        this.ten = "";
    }
    public void setTen(){
        String [] a = hoten.trim().split("\\s+");
        this.ten = a[a.length-1];
    }
    public void setBomon(){
        String [] b = bomon.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.length; i++){
            sb.append(b[i].substring(0,1).toUpperCase());
        }
        bomon = sb.toString();
    }
    @Override
    public String toString(){
        return ma + " " + hoten + " " + bomon;
    }
    @Override
    public int compareTo(GiangVien other){
        if(this.ten.equals(other.ten)){
            return this.ma.compareTo(other.ma);
        }
        return this.ten.compareTo(other.ten);
    }
}
