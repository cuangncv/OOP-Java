package nhapxuathang;

import java.util.ArrayList;
import java.util.Scanner;

public class J05076_NHAP_XUAT_HANG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> lt = new ArrayList<>();
        while(t-- >0){
            MatHang m = new MatHang(in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(m);
        }
        int q = Integer.parseInt(in.nextLine());
        ArrayList<NhapXuat> arr = new ArrayList<>();
        while(q-- >0){
            String ma = in.next();
            long slNhap = in.nextLong();
            long giaNhap = in.nextLong();
            long slXuat = in.nextLong();
            for(MatHang a : lt){
                if(a.getMa().equals(ma)){
                    NhapXuat nx = new NhapXuat(a, slNhap * giaNhap, giaNhap * slXuat * a.getXepLoai() / 100 );
                    arr.add(nx);
                    break;
                }
            }
        }
        for(NhapXuat n : arr) System.out.println(n);
        in.close();
    }
}
class MatHang {
    private String ma, ten, xepLoai;

    public MatHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public long getXepLoai() {
        if(xepLoai.equals("A")) return 108;
        if(xepLoai.equals("B")) return 105;
        return 102;
    }
}
class NhapXuat {
    private MatHang mh;
    private long giaNhap, giaXuat;

    public NhapXuat(MatHang mh, long giaNhap, long giaXuat) {
        this.mh = mh;
        this.giaNhap = giaNhap;
        this.giaXuat = giaXuat;
    }
    @Override
    public String toString(){
        return mh.getMa() + " " + mh.getTen() + " " + giaNhap + " " + giaXuat;
     }
}