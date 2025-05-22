import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07072_CHUAN_HOA_VA_SAP_XEP {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> lt = new ArrayList<>();
        while(in.hasNextLine()){
            HoTen ht = new HoTen(in.nextLine());
            ht.setHoten();
            lt.add(ht);
        }
        Collections.sort(lt);
        for(HoTen i:lt){
            System.out.println(i);
        }
        in.close();
    }
}
class HoTen implements Comparable<HoTen> {
    private String ten , ho, tendem, hoten;
    public HoTen (String hoten){
        String [] a = hoten.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            sb.append(a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ");
        }
        this.hoten = sb.toString();
    }
    public void setHoten (){
        String [] a = hoten.trim().split("\\s+");
        ho = a[0];
        ten = a[a.length - 1];
        if(a.length > 2){
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < a.length - 1; i++){
                sb.append(a[i] + " ");
            }
            tendem = sb.toString();
        }
        else tendem = "";
    }
    @Override
    public int compareTo(HoTen other){
        if(this.ten.equals(other.ten)){
            if(this.ho.equals(other.ho)){
                return this.tendem.compareTo(other.tendem);
            }
            return this.ho.compareTo(other.ho);
        }
        return this.ten.compareTo(other.ten);
    }
    @Override
    public String toString(){
        return this.hoten;
    }
}
