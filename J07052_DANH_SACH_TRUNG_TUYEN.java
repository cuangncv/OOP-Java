package dstrungtuyen;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07052_DANH_SACH_TRUNG_TUYEN {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- >0){
            ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            lt.add(ts);
        }
        Collections.sort(lt);
        int q = Integer.parseInt(in.nextLine());
        double p = lt.get(q - 1).getXetTuyen();
        System.out.println(String.format("%.1f", p));
        for(ThiSinh s : lt){
            if(q > 0 || s.getXetTuyen() == p){
                System.out.println(s + "TRUNG TUYEN");
            }
            else System.out.println(s + "TRUOT");
            q--;
        }
    }
}
class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten;
    private double diemUT, xetTuyen;

    public ThiSinh(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        setTen(ten);
        setDiemUuTien(ma);
        this.xetTuyen = d1 * 2 + d2 + d3 + diemUT;
    }

    public double getXetTuyen() {
        return xetTuyen;
    }

    private void setTen(String ten){
        String [] a = ten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i ++){
            sb.append(a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ");
        }
        this.ten = sb.toString();
    }

    private void setDiemUuTien(String ma){
        String x = ma.substring(0,3);
        if(x.equals("KV1")) this.diemUT = 0.5;
        if(x.equals("KV2")) this.diemUT = 1;
        if(x.equals("KV3")) this.diemUT = 2.5;
    }
    private String formatNumber(double number) {
        if (number == (int) number) {
            return String.format("%d", (int) number); // In dưới dạng int nếu là số nguyên
        }
        return String.format("%.1f", number); // In dưới dạng 1 chữ số thập phân nếu không phải số nguyên
    }
    public int compareTo(ThiSinh other){
        if(this.xetTuyen == other.xetTuyen){
            return this.ma.compareTo(other.ma);
        }
        return Double.compare(other.xetTuyen, this.xetTuyen);
    }
    @Override
    public String toString(){
        return ma + " " + ten + formatNumber(diemUT) + " " + formatNumber(xetTuyen) + " ";
    }
}