import java.util.Scanner;

public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- > 0){
            String s = in.nextLine();
            String key = chuanHoa(s);
            System.out.println(key);
        }
        in.close();
    }
    public static String chuanHoa (String s){
        StringBuilder sb = new StringBuilder();
        String [] words = s.trim().split("\\s+");
        for(int i = 1; i < words.length; i++){
            String x = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
            if(sb.length() > 0){
                sb.append(" ");
            }
            sb.append(x);
        }
        sb.append(", " + words[0].toUpperCase());
        return sb.toString();
    }
}
