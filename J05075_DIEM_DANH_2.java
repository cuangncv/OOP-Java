package ddh;
import java.util.ArrayList;
import java.util.Scanner;

public class J05075_DIEM_DANH_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> lt = new ArrayList<>();
        for(int i = 0; i < t; i++){
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(sv);
        }
        ArrayList<ChuyenCan> arr = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String msv = in.next();
            String diemDanh = in.nextLine();
            int diem = 10;
            String ghiChu = "";
            for(int j = 0; j < diemDanh.length(); j++){
                if(diemDanh.charAt(j) == 'v') diem -= 2;
                if(diemDanh.charAt(j) == 'm') diem -= 1;
            }
            if(diem < 0) diem = 0;
            if(diem == 0) ghiChu = "KDDK";
            for(SinhVien s : lt){
                if(s.getMa().equals(msv)){
                    ChuyenCan cc = new ChuyenCan(s, diem, ghiChu);
                    arr.add(cc);
                    break;
                }
            }
        }
        String lop = in.nextLine();
        for(SinhVien q : lt){
            if(q.getLop().equals(lop)){
                for(ChuyenCan c : arr) {
                    if (q.getMa().equals(c.getMa())) {
                       System.out.println(c);
                       break;
                    }
                }
            }
        }
        in.close();
    }
}

class SinhVien {
    private String ma, ten, lop;

    public SinhVien(String ma, String ten, String lop){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    public String getMa(){
        return ma;
    }
    public String getLop(){
        return lop;
    }

    public String toString(){
        return ma + " " + ten + " " + lop;
    }
}

class ChuyenCan {
    private SinhVien sv;
    private int diem;
    private String ghiChu;

    public ChuyenCan(SinhVien sv, int diem, String ghiChu) {
        this.sv = sv;
        this.diem = diem;
        this.ghiChu = ghiChu;
    }
    public String getMa(){
        return sv.getMa();
    }

    @Override
    public String toString(){
        return sv.toString() + " " + diem + " " + ghiChu;
    }

}