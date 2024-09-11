import java.util.*;
public class J01011_BOISOCHUNG_UOCSOCHUNG {
    public static long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public static long bcnn(long a, long b){
        return (a*b)/ucln(a,b);
    }
    public static void main(String[] args){
        Scanner qu= new Scanner(System.in);
        int t= qu.nextInt();
        for(int i=0;i<t;i++){
            long a= qu.nextLong();
            long b= qu.nextLong();
            System.out.println(bcnn(a,b)+" " +ucln(a,b));
        }
    }
}