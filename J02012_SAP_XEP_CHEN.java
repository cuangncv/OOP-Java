import java.util.*;

public class J02012_SAP_XEP_CHEN {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int [n];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        List<Integer> lt = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.printf("Buoc %d: ",i);
            lt.add(a[i]);
            Collections.sort(lt);
            for(int x : lt){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
