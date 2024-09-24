import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02024_DAY_CON_CO_TONG_LE {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                dayCon(a[i]+" ",i, a[i], a);
            }
        }
        in.close();
    }
    public static void dayCon (String s, int i, int sum, int [] a){
        if(sum % 2 == 1) System.out.println(s);
        for (int j = 0; j < i; j++){
            dayCon(s+a[j]+" ",j,sum + a[j],a);
        }
    }
}
