package team;
import java.util.ArrayList;
import java.util.Scanner;

public class J05069_CAU_LAC_BO_BONG_DA_1 {
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
            TranDau td = new TranDau(maTran, soCdv);
            for(CLB x : lt){
                if(x.getMaDoi().equals(maTran.substring(1,3))){
                    td.setClb(x);
                    break;
                }
            }
            arr.add(td);
        }
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
class TranDau {
    private String maTran;
    private long soNguoi;
    private CLB clb;

    public TranDau (String maTran, long soNguoi){
        this.maTran = maTran;
        this.soNguoi = soNguoi;
    }
    public void setClb (CLB clb){
        this.clb = clb;
    }

    @Override
    public String toString(){
        return maTran + " " + clb.getTen() + " " + clb.getGiaVe() * soNguoi;
    }
}