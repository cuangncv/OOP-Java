import java.util.Scanner;

public class BaiTap10 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int xanh = 0, trang =0, d = 0;
        int x = 0, y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'X') xanh ++;
            if(s.charAt(i) == 'T') trang ++;
            if(s.charAt(i) == 'D') d ++;
        }
        int count = 0;
        for(int i = 0; i < xanh; i++){
            if(s.charAt(i) != 'X') count ++;
        }
        for(int i = n - d; i < n; i++){
            if(s.charAt(i) != 'D') count ++;
        }
        for(int i = n - d; i < n; i++){
            if(s.charAt(i) == 'X') x++;
        }
        for(int i = 0; i < xanh; i++){
            if(s.charAt(i) == 'D') y ++;
        }
        int key = count - Math.min(x,y);
        System.out.println(key);
        in.close();
    }
}
