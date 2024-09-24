import java.util.Scanner;

public class J02035_QUAY_PHAI {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            long [] a = new long[n];
            int k = 0;
            for(int i = 0; i < n; i++){
                a[i] = in.nextLong();
                if(i > 0 && a[i] < a[i-1]) k = i;
            }
            System.out.println(k);
        }
        in.close();
    }
}
