package diemts;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07057_DIEM_TUYEN_SINH {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> lt = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ThiSinh ts = new ThiSinh (i, in.nextLine(), Double.parseDouble(in.nextLine()), in.nextLine(), Integer.parseInt(in.nextLine()));
            ts.setHoten();
            ts.setTongdiem();
            ts.setTrangthai();
            lt.add(ts);
        }
        Collections.sort(lt);
        for(ThiSinh x : lt){
            System.out.println(x);
        }
        in.close();
    }
}

class ThiSinh implements Comparable<ThiSinh>{
    private String ma, hoten, dantoc, trangthai;
    private int  kv;
    private double tongdiem, diemthi;

    public ThiSinh (int i, String hoten, double diemthi, String dantoc, int kv){
        this.ma = String.format("TS%02d",i);
        this.hoten = hoten;
        this.diemthi = diemthi;
        this.dantoc = dantoc;
        this.kv = kv;
        this.tongdiem = 0;
    }
    public void setHoten() {
        String [] a = hoten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            String x = a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase();
            sb.append(x + " ");
        }
        hoten = sb.toString();
    }
    public void setTongdiem() {
        if(!dantoc.equals("Kinh")) tongdiem += 1.5;
        if(kv == 1) tongdiem += 1.5;
        if(kv == 2) tongdiem += 1;
        tongdiem += diemthi;
    }
    public void setTrangthai(){
        if(tongdiem >= 20.5) trangthai = "Do";
        else trangthai = "Truot";
    }

    @Override
    public String toString(){
        return ma + " " + hoten  + String.format("%.1f",tongdiem) + " " + trangthai;
    }

    @Override
    public int compareTo(ThiSinh other){
        if(this.tongdiem == other.tongdiem){
            return this.ma.compareTo(other.ma);
        }
        return Double.compare(other.tongdiem, this.tongdiem);
    }
}