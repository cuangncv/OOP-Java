import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0){
            String s = in.nextLine();
            daoNguoc(s);
        }
        in.close();
    }
    public static void daoNguoc (String s){
        String [] q = s.trim().split("\\s+");
        for (int i = q.length - 1; i >= 0; i--){
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
