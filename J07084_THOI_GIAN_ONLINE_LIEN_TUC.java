package thoigianonl;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07084_THOI_GIAN_ONLINE_LIEN_TUC {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> lt = new ArrayList<>();
        while(n-- >0){
            SinhVien sv = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine());
            sv.setSophut();
            lt.add(sv);
        }
        Collections.sort(lt);
        for(SinhVien s : lt){
            System.out.println(s);
        }
        in.close();
    }
}
class SinhVien implements Comparable <SinhVien> {
    private String hoten , dangnhap, dangxuat;
    private long sophut;
    public SinhVien (String hoten, String dangnhap, String dangxuat){
        this.hoten = hoten;
        this.dangnhap = dangnhap;
        this.dangxuat = dangxuat;
    }
    public void setSophut(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime ldt1 = LocalDateTime.parse(dangnhap, dtf);
        LocalDateTime ldt2 = LocalDateTime.parse(dangxuat, dtf);
        Duration d = Duration.between(ldt1, ldt2);
        sophut = d.toMinutes();
    }

    @Override
    public int compareTo(SinhVien other){
        if(this.sophut == other.sophut){
            return this.hoten.compareTo(other.hoten);
        }
        return Long.compare(other.sophut, this.sophut);
    }
    @Override
    public String toString(){
        return hoten + " " + sophut;
    }
}