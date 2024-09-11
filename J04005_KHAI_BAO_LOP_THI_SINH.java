import java.util.Scanner;

class ThiSinh {
    private String hoten;
    private String ngaysinh;
    private double d1;
    private double d2;
    private double d3;
    public ThiSinh (String hoten, String ngaysinh, double d1, double d2, double d3){
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public double tinhToan(){
        return d1 + d2 + d3;
    }
    public String ketQua(){
        return String.format("%s %s %.1f",hoten,ngaysinh,tinhToan());
    }
}
public class J04005_KHAI_BAO_LOP_THI_SINH {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String hoten = in.nextLine();
        String ngaysinh = in.nextLine();
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        double d3 = in.nextDouble();
        ThiSinh ts = new ThiSinh(hoten,ngaysinh,d1,d2,d3);
        System.out.println(ts.ketQua());
        in.close();
    }
}
