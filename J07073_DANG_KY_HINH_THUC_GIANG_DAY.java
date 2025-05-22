package htdd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07073_DANG_KY_HINH_THUC_GIANG_DAY {
    public static void main(String[] args)  throws  Exception{
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> lt = new ArrayList<>();
        while(t-- >0){
            MonHoc mh = new MonHoc(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), in.nextLine(), in.nextLine());
            if(mh.check()){
                lt.add(mh);
            }
        }
        Collections.sort(lt);
        for(MonHoc h : lt){
            System.out.println(h);
        }
        in.close();
    }
}
class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, lythuyet, thuchanh;
    private int tinchi;
    public MonHoc (String ma, String ten, int tinchi, String lythuyet, String thuchanh){
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    public boolean check(){
        if(thuchanh.equals("Truc tuyen") || thuchanh.contains("ptit.edu.vn")) return true;
        return false;
    }
    @Override
    public int compareTo(MonHoc other){
        return this.ma.compareTo(other.ma);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + tinchi + " " + lythuyet + " " + thuchanh;
    }
}