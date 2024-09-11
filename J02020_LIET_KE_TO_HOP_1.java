import java.util.Scanner;
public class J02020_LIET_KE_TO_HOP_1 {
    private static int cnt = 0;
    public static void sinh(int a[], int n, int k, int i){
        for(int j=a[i-1]+1; j<=n-k+i; j++){
            a[i]=j;
            if(i == k){
                for(int h = 1; h <= k; h++){
                    System.out.print(a[h]+" ");
                }
                System.out.println();
                cnt++;
            }
            else sinh(a,n,k,i+1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int []a = new int [k+1];
        sinh(a,n,k,1);
        System.out.printf("Tong cong co %d to hop",cnt);
        in.close();
    }
}
