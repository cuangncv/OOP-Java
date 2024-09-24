import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ThucHanh2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int [] a = new int [n];
            HashSet<Integer> se = new HashSet<>();
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                se.add(a[i]);
            }
            tangGiam(n,se);
        }
        in.close();
    }
    public static void tangGiam (int n,HashSet<Integer> se ){
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();
        for(int i : se){
            if(i % 2 == 0) chan.add(i);
            else le.add(i);
        }
        Collections.sort(chan);
        Collections.sort(le,Collections.reverseOrder());
        for(int x : chan) System.out.print(x+" ");
        System.out.println();
        for(int x : le) System.out.print(x+" ");
        System.out.println();
    }
}
