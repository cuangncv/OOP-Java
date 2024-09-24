import java.util.Scanner;

public class J03036_XOAY_VONG_KY_TU {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [] a = new String[n];
        in.nextLine();
        for(int i = 0; i < n ; i++) a[i] = in.nextLine();
        int res = 100000000 , check = 1;
        for(int i = 0; i < n; i++){
            int so = 0;
            for (int j = 0 ; j < n; j++){
                int count = doiCho(a[j] ,a[i]);
                if(count == -1){
                    check = 0;
                    break;
                }
                else {
                    so += count;
                }
            }
            res = Math.min(res,so);
        }
        System.out.println(check == 1 ? res : -1);
        in.close();
    }
    public static int doiCho (String q, String o){
        int dem = 0;
        while(!q.equals(o)){
            q = q.substring(1) + q.substring(0,1);
            dem ++;
            if(q.length() <= dem) return -1;
        }
        return dem;
    }
}
