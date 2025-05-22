package thukhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009_TIM_THU_KHOA_KY_THI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= t; i++){
            ThiSinh ts = new ThiSinh(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            arr.add(ts);
        }
        Collections.sort(arr);
        double x = arr.get(0).getTongDiem();
        for(ThiSinh s : arr){
            if(s.getTongDiem() == x){
                System.out.println(s);
            }
            else break;
        }
        in.close();
    }
}
class ThiSinh implements Comparable<ThiSinh>{
    private String hoTen, ngaySinh;
    private double tongDiem;
    private int ma;
    public ThiSinh (int i, String hoTen, String ngaySinh, double d1, double d2, double d3){
        this.ma = i;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.tongDiem = d1 + d2 + d3;
    }
    public double getTongDiem(){
        return tongDiem;
    }
    public String toString(){
        return ma + " " + hoTen + " " + ngaySinh + " " + tongDiem;
    }
    public int compareTo(ThiSinh other){
        return Double.compare(other.tongDiem, this.tongDiem);
    }
}
