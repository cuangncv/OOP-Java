import java.math.BigInteger;
import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            BigInteger a = in.nextBigInteger();
            if (a.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)) {
                System.out.println("1");
            } else System.out.println("0");
        }
        in.close();
    }
}