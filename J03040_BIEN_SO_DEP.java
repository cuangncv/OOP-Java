import java.util.Scanner;

public class J03040_BIEN_SO_DEP {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- >0){
            String s = in.nextLine();
           if(biensoDep(s)) System.out.println("YES");
           else System.out.println("NO");
        }
        in.close();
    }
    public static boolean biensoDep (String s){
        if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)) return true;
        if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)) return true;
        int check = 0;
        for(int i = 5; i <= 11 ; i++ ){
            if(i!=8){
                if(s.charAt(i) != '6' && s.charAt(i) != '8') {
                    check = 1;
                    return false;
                }
            }
        }
        if(check == 0) return true;
        return false;
    }
}
