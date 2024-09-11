import java.math.BigInteger;
import java.util.Scanner;

class phanSo03 {
    private BigInteger tuso;
    private BigInteger mauso;
    public phanSo03 (BigInteger tuso, BigInteger mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public String ketQua (){
        StringBuilder sb = new StringBuilder();
        BigInteger x = tuso.gcd(mauso);
        tuso = tuso.divide(x);
        mauso = mauso.divide(x);
        sb.append(tuso+"/"+mauso);
        return sb.toString();
    }
}
public class J04003_PHAN_SO {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        phanSo03 a = new phanSo03(in.nextBigInteger(), in.nextBigInteger());
        System.out.println(a.ketQua());
    }
}
