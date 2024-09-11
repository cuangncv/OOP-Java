import java.util.*;

public class J03031_XAU_DAY_DU {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0){
            String s = in.nextLine();
            int k = in.nextInt();
            in.nextLine();
            if(26 - soKytu(s) > k || s.length() < 26){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
        in.close();
    }
    public static int soKytu (String s){
        Set<Character> se = new HashSet<>();
        for(Character x : s.toCharArray()){
            se.add(x);
        }
        return se.size();
    }
}
