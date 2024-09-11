import java.math.BigInteger;
import java.util.Scanner;

public class J03018_TIM_SO_DU {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            BigInteger a = in.nextBigInteger();
            BigInteger x1 = BigInteger.ONE;
            BigInteger x2 = BigInteger.valueOf(2).modPow(a,BigInteger.valueOf(5));
            BigInteger x3 = BigInteger.valueOf(3).modPow(a,BigInteger.valueOf(5));
            BigInteger x4 = BigInteger.valueOf(4).modPow(a,BigInteger.valueOf(5));
            BigInteger x = x1.add(x2.add(x3.add(x4)));
            System.out.println(x.mod(BigInteger.valueOf(5)));
        }
        in.close();
    }
}