import java.util.Scanner;

public class J02037_DAY_UU_THE {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            if(dayuuThe(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
    public static boolean dayuuThe (String s){
        String [] a = s.trim().split("\\s+");
        int chan = 0, le = 0;
        for(int i = 0; i < a.length; i++){
            int x = Integer.parseInt(a[i]);
            if(x % 2 == 0) chan ++;
            else le ++;
        }
        if(a.length % 2 == 0 &&  chan > le) return true;
        if(a.length % 2 != 0 &&  chan < le) return true;
        return false;
    }
}
