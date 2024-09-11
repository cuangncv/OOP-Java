import java.util.*;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while ( t-- > 0){
            String a = in.nextLine();
            String b = in.nextLine();
            Set<String> wordsa = new TreeSet<>(Arrays.asList(a.split("\\s++")));
            Set<String> wordsb = new TreeSet<>(Arrays.asList(b.split("\\s++")));
            wordsa.removeAll(wordsb);
            for (String s : wordsa){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
