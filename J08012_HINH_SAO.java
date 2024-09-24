import java.util.*;

public class J08012_HINH_SAO {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] q = new int [n+1];
        for(int i = 1; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            q[a]++;
            q[b]++;
        }
        System.out.print(hinhSao(n,q));
        in.close();
    }
    public static String hinhSao (int n, int [] q){
        for(int i = 0; i < q.length; i++){
            if(q[i] == n - 1) return "Yes";
        }
        return "No";
    }
}
