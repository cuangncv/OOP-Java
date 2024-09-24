import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            System.out.println(kyTus(s));
        }
        in.close();
    }
    public static String kyTus (String s){
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> a = new ArrayList<>();
        long ss = 0;
        for(int i = 0; i < s.length(); i++){
            Character x = s.charAt(i);
            if(Character.isDigit(x)) ss += (x-'0');
            if(Character.isAlphabetic(x)) a.add(x);
        }
        Collections.sort(a);
        for(Character w : a) sb.append(w);
        sb.append(ss);
        return sb.toString();
    }
}
