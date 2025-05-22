package lietkenganh;
import java.util.ArrayList;
import java.util.Scanner;

public class J05024_LIET_KE_SINH_VIEN_THEO_NGANH {
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
            String e = "";
            switch (p){
                case "Ke toan":
                    e = "DCKT";
                    break;
                case "Cong nghe thong tin":
                    e = "DCCN";
                    break;
                case "An toan thong tin":
                    e = "DCAT";
                    break;
                case "Dien tu":
                    e = "DCDT";
                    break;
                case "Vien thong":
                    e = "DCVT";
                    break;
            }
            System.out.printf("DANH SACH SINH VIEN NGANH %s:",p.toUpperCase());
            System.out.println();
            for(SinhVien q : lt){
                if (q.getMsv().contains(e)) {
                    if (e.equals("DCCN") || e.equals("DCAT")) {
                        if( !q.getLop().equals("E")) {
                            System.out.println(q);
                        }
                    }
                    else System.out.println(q);
                }
            }
        }
    }
}
class SinhVien {
    private String msv, hoten, lop, email;

    public SinhVien(String msv, String hoten, String lop, String email){
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }
    public String getLop(){
        return lop.substring(0,1);
    }
    @Override
    public String toString(){
        return msv + " " + hoten + " " + lop + " " + email;
    }
}
