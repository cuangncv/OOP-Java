import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05011_TINH_GIO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<GameThu> lt = new ArrayList<>();
        while(t-- > 0){
            GameThu gt = new GameThu (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            gt.setThoiGian();
            lt.add(gt);
        }
        Collections.sort(lt);
        for(GameThu g : lt){
            System.out.println(g);
        }
        in.close();
    }
}
class GameThu implements Comparable<GameThu>{
    private String ma, ten, vao, ra, thoiGian;
    private long soPhut, soGio;

    public GameThu (String ma, String ten, String vao, String ra){
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
    }
    public void setThoiGian() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime ld1 = LocalTime.parse(vao, dtf);
        LocalTime ld2 = LocalTime.parse(ra, dtf);
        Duration d = Duration.between(ld1, ld2);
        soGio = d.toHours();
        soPhut = d.toMinutes() % 60;
        thoiGian = String.format("%d gio %d phut", soGio, soPhut);
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + thoiGian;
    }
    @Override
    public int compareTo(GameThu other){
        if(this.soGio == other.soGio)
            return Long.compare(other.soPhut,this.soPhut);
        return Long.compare(other.soGio,this.soGio);
    }
}
