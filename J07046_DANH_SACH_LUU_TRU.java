import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Khach> dsK = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Khach k = new Khach(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            k.setMa(i+1);
            k.setSoNgay();
            dsK.add(k);
        }
        Collections.sort(dsK);
        for(Khach k : dsK) {
            System.out.println(k);
        }
        in.close();
    }
}
class Khach implements Comparable<Khach>{
    private String ten, ma, maPhong, ngayVao, ngayRa;
    private long soNgay;

    public Khach(String ten, String maPhong, String ngayVao, String ngayRa) {
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayVao = ngayVao;
        this.ngayRa = ngayRa;
    }

    public void setMa(int i) {
        ma = String.format("KH%02d", i);
    }

    public void setSoNgay() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld1 = LocalDate.parse(ngayVao, dtf);
        LocalDate ld2 = LocalDate.parse(ngayRa, dtf);
        soNgay = ChronoUnit.DAYS.between(ld1, ld2);
    }

    public int compareTo(Khach other) {
        return Long.compare(other.soNgay, this.soNgay);
    }

    public String toString() {
        return String.format("%s %s %s %d", ma, ten, maPhong, soNgay);
    }
}

