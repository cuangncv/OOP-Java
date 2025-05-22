package sxmh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010_SAP_XEP_DANH_SACH_MAT_HANG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            MatHang mh = new MatHang(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            arr.add(mh);
        }
        Collections.sort(arr);
        for(MatHang i : arr){
            System.out.println(i);
        }
        in.close();
    }
}
class MatHang implements Comparable<MatHang>{
    private int ma;
    private String ten, nhom;
    private double loinhuan;
    public MatHang(int i, String ten, String nhom, double giamua, double giaban){
        this.ma = i;
        this.ten = ten;
        this.nhom = nhom;
        this.loinhuan = giaban - giamua;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loinhuan);
    }
    public int compareTo(MatHang other){
        return Double.compare(other.loinhuan, this.loinhuan);
    }
}