import java.util.Scanner;
public class J02011_SAP_XEP_CHON {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int []q = new int [t];
        for(int i=0; i<t; i++) q[i] = in.nextInt();
        for(int i=0 ;i<t-1; i++){
            System.out.printf("Buoc %d: ",i+1);
            int key = i;
            for(int j=i+1;j<t;j++){
                if(q[key] > q[j]) key = j;
            }
            if(key != i){
                int temp = q[i];
                q[i] = q[key];
                q[key] = temp;
            }
            for(int k = 0; k<t ; k++) System.out.print(q[k]+" ");
            System.out.println();
        }
        in.close();
    }
}
