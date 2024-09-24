import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ThucHanh1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] a = new int [1001];
        int [] b = new int [1001];
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            a[x] = 1;
        }
        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            b[x] = 1;
        }
        tapHop(a,b);
        in.close();
    }
    public static void tapHop (int [] a, int [] b){
        List<Integer> giao = new ArrayList<>();
        List<Integer> AB = new ArrayList<>();
        List<Integer> BA = new ArrayList<>();
        for(int i = 0; i <= 1000 ;i++){
            if(a[i] == 1 && b[i] == 1) giao.add(i);
            if(a[i] == 1 && b[i] == 0) AB.add(i);
            if(a[i] == 0 && b[i] == 1) BA.add(i);
        }
        for(int q : giao) System.out.print(q+" ");
        System.out.println();
        for(int q : AB) System.out.print(q+" ");
        System.out.println();
        for(int q : BA) System.out.print(q+" ");
    }
}
