import java.util.Scanner;

public class BaiTap9 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        long [] q = new long[n];
        for (int i = 0; i < n; i++){
            q[i] = in.nextLong();
        }
        System.out.println(soCap(n,q));
    }
    public static long soCap (int n, long [] q){
        long dem = 0;
        for(int i = 0; i < n-1; i++){
            dem++;
            long maxx = 0;
            for(int j = i+2; j < n; j++){
                maxx = Math.max(maxx, q[j-1]);
                if(maxx > q[i] || maxx > q[j]) break;
                else dem ++;
            }
        }
        return dem;
    }
}
