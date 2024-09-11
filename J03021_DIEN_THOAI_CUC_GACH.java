import java.util.*;

public class J03021_DIEN_THOAI_CUC_GACH {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- > 0){
            String s = in.nextLine();
            String ss = s.toUpperCase();
            if(check(ss)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
    public static boolean check ( String ss){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ss.length(); i++){
            if(ss.charAt(i) == 'A' || ss.charAt(i) == 'B' || ss.charAt(i) == 'C') sb.append("2");
            else if(ss.charAt(i) == 'D' || ss.charAt(i) == 'E' || ss.charAt(i) == 'F') sb.append("3");
            else if(ss.charAt(i) == 'G' || ss.charAt(i) == 'H' || ss.charAt(i) == 'I') sb.append("4");
            else if(ss.charAt(i) == 'J' || ss.charAt(i) == 'K' || ss.charAt(i) == 'L') sb.append("5");
            else if(ss.charAt(i) == 'M' || ss.charAt(i) == 'N' || ss.charAt(i) == 'O') sb.append("6");
            else if(ss.charAt(i) == 'P' || ss.charAt(i) == 'Q' || ss.charAt(i) == 'R' || ss.charAt(i) == 'S') sb.append("7");
            else if(ss.charAt(i) == 'T' || ss.charAt(i) == 'U' || ss.charAt(i) == 'V') sb.append("8");
            else sb.append("9");
        }
        String q = sb.toString();
        String p = sb.reverse().toString();
        if(p.equals(q)) return true;
        else return false;
    }
}
