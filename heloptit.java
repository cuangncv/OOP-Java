import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Phim implements Comparable<Phim> {
    private String ma, ten, the_loai;
    private LocalDate ngay;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int so_tap;

    public Phim(int i, String the_loai, String ngay, String ten, int so_tap) {
        this.ma = String.format("P%03d", i+1);
        this.the_loai = the_loai;
        this.ngay = LocalDate.parse(ngay, dtf);
        this.ten = ten;
        this.so_tap = so_tap;
    }

    public int compareTo(Phim other) {
        if(this.ngay.equals(other.ngay)) {
            if(this.ten.equals(other.ten)) return Integer.compare(other.so_tap, this.so_tap);
            else return this.ten.compareTo(other.ten);
        } else return this.ngay.compareTo(other.ngay);
    }

    public String toString() {
        return ma + " " + the_loai + " " + ngay.format(dtf) + " " + ten + " " + so_tap;
    }
}

public class Bai_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, String> mapTheLoai = new HashMap<>();
        ArrayList<Phim> listPhim = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String ma = String.format("TL%03d", i+1);
            String the_loai = sc.nextLine();
            mapTheLoai.put(ma, the_loai);
        }

        for(int i = 0; i < m; i++) {
            String maTL =  sc.nextLine();
            String ngay = sc.nextLine();
            String ten = sc.nextLine();
            int so_tap = Integer.parseInt(sc.nextLine());

            Phim p = new Phim(i, mapTheLoai.get(maTL), ngay, ten, so_tap);
            listPhim.add(p);
        }

        Collections.sort(listPhim);

        for(Phim p : listPhim) System.out.println(p);

        sc.close();
    }
}