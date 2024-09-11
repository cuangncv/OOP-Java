import java.util.Scanner;
public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static void main (String [] args){
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
    public static String chuanHoa(String s){
        s = s.trim();
        String []words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            String x = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
            sb.append(x+" ");
        }
        return sb.toString();
    }
}