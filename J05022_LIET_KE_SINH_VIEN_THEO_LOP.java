package lietkelop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05022_LIET_KE_SINH_VIEN_THEO_LOP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> lt = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lt.add(sv);
        }
        int truyvan = Integer.parseInt(in.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < truyvan; i++){
            String x = in.nextLine();
            arr.add(x);
        }
        for(String p : arr){
            System.out.printf("DANH SACH SINH VIEN LOP %s:",p);
            System.out.println();
            for(SinhVien q : lt){
                if(q.getLop().equals(p)){
                    System.out.println(q);
                }
            }
        }
    }
}
class SinhVien {
    private String msv, hoten, lop, email, loptruyvan;

    public SinhVien(String msv, String hoten, String lop, String email){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return msv + " " + hoten + " " + lop + " " + email;
    }
}
