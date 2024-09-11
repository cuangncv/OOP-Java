import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_SO_0_VA_SO_9 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Queue<Long> qu = new LinkedList<>();
            qu.add(9L);
            while(true){
               Long x = qu.remove();
               if(x % n == 0){
                   System.out.println(x);
                   break;
               }
               qu.add(x*10);
               qu.add(x*10 +9);
            }
        }
        in.close();
    }
}
