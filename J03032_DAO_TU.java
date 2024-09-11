import java.util.Scanner;

public class J03032_DAO_TU {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- > 0){
            String s = in.nextLine();
            String [] a = s.trim().split("\\s+");
            for(int i = 0; i<a.length; i++){
                System.out.print(daoTu(a[i])+" ");
            }
            System.out.println();
        }
        in.close();
    }
    public static String daoTu (String p){
        StringBuilder sb = new StringBuilder(p);
        return sb.reverse().toString();
    }
}
