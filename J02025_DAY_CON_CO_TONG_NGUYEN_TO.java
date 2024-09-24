import java.util.Arrays;
import java.util.Scanner;

public class J02025_DAY_CON_CO_TONG_NGUYEN_TO {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0){
            int n = in.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                tongNT(a[i],a[i]+" ", i, a);
            }
        }
        in.close();
    }
    public static boolean soNT (int x){
        if(x < 2) return false;
        for(int k = 2; k <= Math.sqrt(x); k++){
            if(x % k == 0) return false;
        }
        return true;
    }
    public static void tongNT (int sum, String s, int i, int [] a){
        if(soNT(sum)) System.out.println(s);
        for(int j = 0; j < i; j++){
            tongNT(sum+a[j],s+a[j]+" ",j,a);
        }
    }
}
