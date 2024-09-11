import java.util.*;

public class J02009_XEP_HANG {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> mp = new HashMap<>();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(mp.containsKey(a)){
                b+=mp.get(a);
            }
            mp.put(a,b);
        }
        int key = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            key = Math.max(key,entry.getKey());
            key += entry.getValue();
        }
        System.out.println(key);
        in.close();
    }
}
