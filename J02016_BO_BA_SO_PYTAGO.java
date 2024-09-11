import java.util.Arrays;
import java.util.Scanner;

public class J02016_BO_BA_SO_PYTAGO {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0){
            int n = in.nextInt();
            long [] a = new long [n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextLong();
                a[i]*=a[i];
            }
            Arrays.sort(a);
            System.out.println(pytaGo(n,a));
        }
        in.close();
    }
    public static String pytaGo(int n,long [] a){
        for (int i = n-1; i >= 2; i--){
            int x = 0, y = i-1;
            while(x < y){
                if(a[x]+a[y] == a[i]) return "YES";
                if(a[x]+a[y] > a[i]) y--;
                else x++;
            }
        }
        return "NO";
    }
}
