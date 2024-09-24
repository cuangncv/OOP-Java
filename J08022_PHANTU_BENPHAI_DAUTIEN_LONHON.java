import java.util.Scanner;

public class J08022_PHANTU_BENPHAI_DAUTIEN_LONHON {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            for(int i = 0; i < n - 1; i++){
                int check = 0;
                for(int j = i + 1; j < n; j++){
                    if(a[j] > a[i]){
                        System.out.print(a[j]+" ");
                        check = 1;
                        break;
                    }
                }
                if(check == 0) System.out.print("-1 ");
            }
            System.out.println("-1");
        }
        in.close();
    }
}
