import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TACH_DOI_VA_TINH_TONG {
    public static void main (String [] args){
        try {
            FileInputStream file = new FileInputStream("DATA.in");
            Scanner in = new Scanner(file);
            BigInteger x = in.nextBigInteger();
            tinhTong(x);
            in.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
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
