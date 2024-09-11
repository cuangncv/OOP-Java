import java.util.Arrays;
import java.util.Scanner;

public class J02026_DAYCON_CO_K_PHANTU_TANGDAN {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int N = in.nextInt();
            int K = in.nextInt();
            int [] a = new int [N];
            for(int i = 0; i < N; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            int [] b = new int [K+1];
            dayCon(b,N,K,1,a);
        }
        in.close();
    }
    public static void dayCon (int [] b,int N, int K, int n, int [] a){
        for(int i = b[n-1]+1; i <= N-K+n; i++){
            b[n] = i;
            if(n == K){
                for(int j = 1; j <= n;j++){
                    System.out.print(a[b[j]-1]+" ");
                }
                System.out.println();
            }
            else dayCon(b,N,K,n+1,a);
        }
    }
}
