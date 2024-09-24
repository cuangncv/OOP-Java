import java.util.Scanner;

public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int test = in.nextInt();
        while(test -- >0){
            long n = in.nextLong();
            long key = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                while(n % i == 0){
                    key = i;
                    n /= i;
                }
            }
            if(n > 1) key = n;
            System.out.println(key);
        }
        in.close();
    }
}
