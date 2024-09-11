import java.util.Scanner;
public class J01006_TINH_SO_FIBONACCI {
    public static void main(String[] args){
        Scanner qu= new Scanner(System.in);
        long []fib= new long[93];
        fib[1]=1;
        fib[2]=1;
        for(int i=3;i<=92;i++) fib[i]=fib[i-1]+fib[i-2];
        int t= qu.nextInt();
        for(int i=0;i<t;i++){
            int n= qu.nextInt();
            System.out.println(fib[n]);
        }
    }
}
