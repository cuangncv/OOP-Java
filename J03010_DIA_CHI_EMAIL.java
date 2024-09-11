import java.util.*;

public class J03010_DIA_CHI_EMAIL {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> mp = new HashMap<>();
        while (t-- >0){
            String s = in.nextLine();
            String email = chuanHoa(s);
            if(mp.containsKey(email)){
                int cnt = mp.get(email);
                mp.put(email, cnt+1);
                email += (cnt+1);
            }
            else mp.put(email ,1);
            System.out.println(email+"@ptit.edu.vn");
        }
        in.close();
    }
    public static String chuanHoa (String s){
        StringBuilder sb = new StringBuilder();
        String []a = s.trim().split("\\s+");
        sb.append(a[a.length-1].toLowerCase());
        for(int i = 0; i < a.length -1 ; i++){
            sb.append(a[i].substring(0,1).toLowerCase());
        }
        return sb.toString();
    }
}
