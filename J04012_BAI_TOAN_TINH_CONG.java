package tinhcong;
import java.util.Scanner;

public class J04012_BAI_TOAN_TINH_CONG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nv = new NhanVien(in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), in.nextLine());
        nv.setThuong();
        nv.setPhucap();
        nv.setThunhap();
        System.out.println(nv);
        in.close();
    }
}
class NhanVien {
    private String ma, hoten, chucvu;
    private int luongcoban, songaycong;
    private int luongthang, thuong, phucap, thunhap;
    public NhanVien (String hoten, int luongcoban, int songaycong, String chucvu){
        this.ma = "NV01";
        this.hoten = hoten;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
        luongthang = luongcoban * songaycong;
    }
    public void setThuong (){
        if(songaycong >= 25) thuong = luongthang / 10 * 2;
        else if(songaycong >= 22) thuong = luongthang /10;
    }
    public void setPhucap(){
        if(chucvu.equals("GD")) phucap = 250000;
        if(chucvu.equals("PGD")) phucap = 200000;
        if(chucvu.equals("TP")) phucap = 180000;
        if(chucvu.equals("NV")) phucap = 150000;
    }
    public void setThunhap(){
        thunhap = luongthang +  thuong + phucap;
    }
    @Override
    public String toString(){
        return ma + " " + hoten + " " + luongthang + " " + thuong + " " + phucap + " " + thunhap;
    }
}
