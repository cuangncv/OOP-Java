package clb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05070_CAU_LAC_BO_BONG_DA_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList <CLB> lt = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            CLB win = new CLB(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            lt.add(win);
        }
        int q = Integer.parseInt(in.nextLine());
        ArrayList<TranDau> arr = new ArrayList<>();
        while(q-- >0){
            String maTran = in.next();
            Long soCdv = in.nextLong();
            for(CLB x : lt){
                if(x.getMaDoi().equals(maTran.substring(1,3))){
                    TranDau td = new TranDau(maTran, soCdv, x);
                    arr.add(td);
                    break;
                }
            }
        }
        Collections.sort(arr);
        for(TranDau p : arr) System.out.println(p);
        in.close();
    }
}
class CLB {
    private String maDoi, ten;
    private long giaVe;

    public CLB (String maDoi, String ten, long giaVe){
        this.maDoi = maDoi;
        this.ten = ten;
        this.giaVe = giaVe;
    }

    public String getMaDoi() {
        return maDoi;
    }
    public String getTen(){
        return ten;
    }
    public long getGiaVe(){
        return giaVe;
    }
}
class TranDau implements Comparable<TranDau> {
    private String maTran;
    private long doanhThu;
    private CLB clb;

    public TranDau (String maTran, long soNguoi, CLB clb){
        this.maTran = maTran;
        this.clb = clb;
        this.doanhThu = clb.getGiaVe() * soNguoi;
    }

    @Override
    public String toString(){
        return maTran + " " + clb.getTen() + " " + doanhThu;
    }

    public int compareTo(TranDau other){
        return Long.compare(other.doanhThu, this.doanhThu);
    }
}