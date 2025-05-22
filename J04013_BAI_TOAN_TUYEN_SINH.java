import java.util.Scanner;

public class J04013_BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TruongXYZ thisinh = new TruongXYZ(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
        thisinh.setDiemuutien();
        thisinh.setTrangthai();
        System.out.println(thisinh);
        in.close();
    }
}
class TruongXYZ {
    private String ma, ten, trangthai;
    private double diemtoan, diemly, diemhoa, diemuutien, tongdiem;

    public TruongXYZ(String ma, String ten, double diemtoan, double diemly, double diemhoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        tongdiem = diemtoan * 2 + diemly + diemhoa;
    }

    public void setDiemuutien() {
        String x = ma.substring(0, 3);
        if (x.equals("KV1")) diemuutien = 0.5;
        if (x.equals("KV2")) diemuutien = 1;
        if (x.equals("KV3")) diemuutien = 2.5;
    }
    public void setTrangthai() {
        if (tongdiem + diemuutien >= 24) trangthai = "TRUNG TUYEN";
        else trangthai = "TRUOT";
    }
    @Override
    public String toString() {
        String diemUuTienStr = (diemuutien % 1 == 0) ? String.format("%.0f", diemuutien) : String.format("%.1f", diemuutien);
        String tongDiemStr = (tongdiem % 1 == 0) ? String.format("%.0f", tongdiem) : String.format("%.1f", tongdiem);
        return String.format("%s %s %s %s %s", ma, ten, diemUuTienStr, tongDiemStr, trangthai);
    }
}
