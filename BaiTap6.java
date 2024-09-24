import java.util.Scanner;

public class BaiTap6 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int cach = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            System.out.println(chuanHoa(s,cach));
        }
        in.close();
    }
    public static String chuanHoa (String s, int cach){
        StringBuilder sb = new StringBuilder();
        String [] q = s.trim().split("\\s+");
        for(int i = 0; i < q.length ; i++){
            q[i] = q[i].substring(0,1).toUpperCase() + q[i].substring(1).toLowerCase();
        }
        if(cach == 1){
            sb.append(q[q.length - 1] + " ");
            for(int i = 0; i < q.length - 1; i++){
                sb.append(q[i] + " ");
            }
        }
        else {
            for(int i = 1; i < q.length; i++){
                sb.append(q[i] + " ");
            }
            sb.append(q[0]);
        }
        return sb.toString();
    }
}
