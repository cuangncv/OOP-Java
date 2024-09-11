import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            int cnt = 0;
            for(int i = 0; i < s.length()/2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - i -1)){
                    cnt++;
                }
            }
            if(cnt == 1 || (s.length() % 2 == 1  &&  cnt == 0)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
