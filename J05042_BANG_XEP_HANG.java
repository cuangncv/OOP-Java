package bxh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05042_BANG_XEP_HANG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            SinhVien sv = new SinhVien(in.nextLine(),in.nextInt(), in.nextInt());
            arr.add(sv);
            in.nextLine();
        }
        Collections.sort(arr);
        for(SinhVien s : arr){
            System.out.println(s);
        }
        in.close();
    }
}
class SinhVien implements Comparable<SinhVien>{
    private String hoTen;
    private int baiDung, luotSubmit;
    public SinhVien (String hoTen, int baiDung, int luotSubmit){
        this.hoTen = hoTen;
        this.baiDung = baiDung;
        this.luotSubmit = luotSubmit;
    }
    public int compareTo(SinhVien other){
        if(this.baiDung == other.baiDung){
            if(this.luotSubmit == other.luotSubmit){
                return this.hoTen.compareTo(other.hoTen);
            }
            return Integer.compare(this.luotSubmit, other.luotSubmit);
        }
        return Integer.compare(other.baiDung, this.baiDung);
    }
    public String toString(){
        return hoTen + " " + baiDung + " " + luotSubmit;
    }
}
