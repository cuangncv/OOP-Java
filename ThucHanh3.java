import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class ThucHanh3 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        BigInteger x = in.nextBigInteger();
        tinhTong(x);
        in.close();
    }
    public static void tinhTong (BigInteger x){
        while(x.toString().length() > 1){
            int mid = x.toString().length()/2;
            String p = x.toString().substring(0,mid);
            String q = x.toString().substring(mid);
            BigInteger a = new BigInteger(p);
            BigInteger b = new BigInteger(q);
            x = a.add(b);
            System.out.println(x);
        }
    }
}