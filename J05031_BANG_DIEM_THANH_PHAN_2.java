package bdtp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05031_BANG_DIEM_THANH_PHAN_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <BangDiem> arr = new ArrayList<>();
        while(t-- >0){
            BangDiem bd = new BangDiem(in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            arr.add(bd);
        }
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++){
            System.out.print((i+1)+" ");
            System.out.println(arr.get(i));
        }
        in.close();
    }
}
class BangDiem implements Comparable<BangDiem>{
    private String ma, ten, lop;
    private double diem1, diem2, diem3;

    public BangDiem (String ma, String ten, String lop, double diem1, double diem2, double diem3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public int compareTo(BangDiem other){
        return this.ten.compareTo(other.ten);
    }

    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + diem1 + " " + diem2 + " " + diem3;
    }
}

