import java.util.Scanner;
public class J01021_TINH_LUY_THUA {
    private static final long MOD = (long)1e9 + 7;
    public static long Pow(long a, long b){
        if(b == 0) return 1;
        long k = Pow(a,b/2);
        if(b%2 == 0) return (k*k)%MOD;
        else return a*((k*k)%MOD)%MOD;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (true) {
            long a = in.nextLong();
            long b = in.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(Pow(a,b));
        }
        in.close();
    }
}
