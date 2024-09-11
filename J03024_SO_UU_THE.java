import java.util.*;

public class J03024_SO_UU_THE {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        in.nextLine();
        while (t-- >0){
            String s = in.nextLine();
            System.out.println(uuThe(s));
        }
        in.close();
    }
    public static String uuThe (String s){
        int le = 0, chan = 0;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return "INVALID";
            }
            int a = s.charAt(i) - '0';
            if(a % 2 == 0) chan ++;
            else le ++;
        }
        if((s.length() % 2 == 0 && chan > le) || (s.length() % 2 != 0 && le > chan)) return "YES";
        else return "NO";
    }
}
