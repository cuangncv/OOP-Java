package timkiemgv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05027_TIM_KIEM_GIANG_VIEN{
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
            String s = in.nextLine();
            arr.add(s);
        }
        for(String x : arr){
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:%n", x);
            for(GiangVien g : lt){
                if(g.getHoten().contains(x.toLowerCase())){
                    System.out.println(g);
                }
            }
        }
        in.close();
    }
}
class GiangVien {
    private String ma,hoten , bomon;

    public GiangVien (int i, String hoten, String bomon){
        this.ma = String.format("GV%02d",i);
        this.hoten = hoten;
        this.bomon = bomon;
    }
    public void setBomon(){
        String [] b = bomon.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b.length; i++){
            sb.append(b[i].substring(0,1).toUpperCase());
        }
        bomon = sb.toString();
    }
    public String getHoten(){
        return hoten.toLowerCase();
    }
    @Override
    public String toString(){
        return ma + " " + hoten + " " + bomon;
    }
}
