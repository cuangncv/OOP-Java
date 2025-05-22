package tinhgiaban;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037_TINH_GIA_BAN_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> lt = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            MatHang mh = new MatHang (i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            lt.add(mh);
        }
        Collections.sort(lt);
        for(MatHang x : lt){
            System.out.println(x);
        }
        in.close();
    }
}
class MatHang implements Comparable<MatHang>{
    private String ma, ten, donvi;
    private long phi, tien, gia;

    public MatHang (int i, String ten, String donvi, long giaNhap, long soLuong){
        this.ma = String.format("MH%02d",i);
        this.ten = ten;
        this.donvi = donvi;
        this.phi = Math.round(soLuong * giaNhap * 5.0 / 100 );
        this.tien = Math.round(giaNhap * soLuong + phi);
        this.gia = (long)Math.ceil(tien * 1.02 / soLuong /100) * 100;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + donvi + " " + phi + " " + tien + " " + gia;
    }

    public int compareTo(MatHang other){
        return Long.compare(other.gia, this.gia);
    }
}