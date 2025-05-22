package dsgv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05026_DANH_SACH_GIANG_VIEN_THEO_BO_MON {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<GiangVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            GiangVien gv = new GiangVien (i, in.nextLine(), in.nextLine());
            gv.setBomon();
            lt.add(gv);
        }
        ArrayList<String> arr = new ArrayList<>();
        int truyvan = Integer.parseInt(in.nextLine());
        for(int i = 0; i < truyvan; i++){
            String [] s = in.nextLine().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s.length; j++){
                sb.append(s[j].substring(0,1).toUpperCase());
            }
            arr.add(sb.toString());
        }
        for(String x : arr){
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:%n", x);
            for(GiangVien g : lt){
                if(g.getBomon().equals(x)){
                    System.out.println(g);
                }
            }
        }
        in.close();
    }
}
class GiangVien {
    private String ma,hoten ,ten, bomon;

    public GiangVien (int i, String hoten, String bomon){
        this.ma = String.format("GV%02d",i);
        this.hoten = hoten;
        this.bomon = bomon;
        this.ten = "";
    }
    public void setBomon(){
        String [] b = bomon.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.length; i++){
            sb.append(b[i].substring(0,1).toUpperCase());
        }
        bomon = sb.toString();
    }
    public String getBomon(){
        return bomon;
    }
    @Override
    public String toString(){
        return ma + " " + hoten + " " + bomon;
    }
}
