import java.util.*;

public class J03026_XAU_KHAC_NHAU_DAI_NHAT {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            String x = in.nextLine();
            if(s.equals(x)) System.out.println("-1");
            else System.out.println(Math.max(s.length(),x.length()));
        }
        in.close();
    }
}
