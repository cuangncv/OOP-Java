import java.util.Scanner;
public class J02013_SAP_XEP_NOI_BOT {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] a = new int[N];
        for(int i=0; i<N; i++) a[i] = in.nextInt();
        int dem =1;
        while(true){
            int check = 0 ;
            for(int i=0 ;i<N-1; i++){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    check = 1;
                }
            }
            if(check == 0) break;
            System.out.printf("Buoc %d: ",dem);
            for(int i = 0; i<N ;i++) System.out.print(a[i]+" ");
            System.out.println();
            dem++;
        }
        in.close();
    }
}
