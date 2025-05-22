import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private LocalDate nsinh;

    public Nguoi(String ten, LocalDate nsinh) {
        this.ten = ten;
        this.nsinh = nsinh;
    }

    public String getTen() {
        return ten;
    }

    public int compareTo(Nguoi other) {
        return this.nsinh.isAfter(other.nsinh) ? -1 : 1;
    }
}

public class J05032_TRE_NHAT_GIA_NHAT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Nguoi> dsNguoi = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0) {
            String ten = in.next();
            String date = in.next();
            LocalDate nsinh = LocalDate.parse(date, dtf);
            Nguoi nguoi = new Nguoi(ten, nsinh);
            dsNguoi.add(nguoi);
        }
        Collections.sort(dsNguoi);
        Nguoi treNhat = dsNguoi.get(0);
        Nguoi giaNhat = dsNguoi.get(dsNguoi.size() - 1);
        System.out.println(treNhat.getTen());
        System.out.println(giaNhat.getTen());
        in.close();
    }
}