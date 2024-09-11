import java.util.Scanner;
public class J02010_SAP_XEP_DOI_CHO_TRUC_TIEP {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int []q = new int [t];
        for(int i=0; i<t; i++) q[i] = in.nextInt();
        for(int i=0 ;i<t-1; i++){
            System.out.printf("Buoc %d: ",i+1);
            for(int j=i+1;j<t;j++){
                if(q[i]>q[j]){
                    int temp = q[i];
                    q[i] = q[j];
                    q[j] = temp;
                }
            }
            for(int k = 0; k<t ; k++) System.out.print(q[k]+" ");
            System.out.println();
        }
        in.close();
    }
}
