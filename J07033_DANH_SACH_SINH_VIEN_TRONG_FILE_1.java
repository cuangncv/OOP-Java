import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07033_DANH_SACH_SINH_VIEN_TRONG_FILE_1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        ArrayList <DanhSachSV> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0){
            DanhSachSV sv = new DanhSachSV(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            sv.setHoten();
            lt.add(sv);
        }
        Collections.sort(lt);
        for(DanhSachSV q : lt){
            System.out.println(q);
        }
        in.close();
    }
}
class DanhSachSV implements Comparable <DanhSachSV> {
    private String msv, hoten, lop, email;
    public DanhSachSV (String msv, String hoten, String lop, String email){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    public void setHoten (){
        String [] a = hoten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            String x = a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase();
            sb.append(x + " ");
        }
        hoten = sb.toString();
    }

    @Override
    public String toString(){
        return msv + " " + hoten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(DanhSachSV other){
        return this.msv.compareTo(other.msv);
    }
}
