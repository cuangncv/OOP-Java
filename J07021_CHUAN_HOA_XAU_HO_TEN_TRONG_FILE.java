import java.io.File;
import java.util.Scanner;

public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("DATA.in"));
        while (true){
            String s = in.nextLine();
            if(s.equals("END")) break;
            String [] a = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : a){
                x = x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x+" ");
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
