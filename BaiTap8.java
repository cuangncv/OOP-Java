import java.util.*;

public class BaiTap8 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0){
            int n = in.nextInt();
            int [] q = new int[n];
            for(int i = 0; i < n; i++){
                q[i] = in.nextInt();
            }
            soLanxuathien(n,q);
        }
        in.close();
    }
    public static void soLanxuathien (int n, int[] q){
        LinkedHashMap<Integer,Integer> lt = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            if(lt.containsKey(q[i])){
                int x = lt.get(q[i]) +1;
                lt.put(q[i],x);
            }
            else lt.put(q[i],1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(lt.entrySet());
        l.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        for(Map.Entry<Integer,Integer> entry : l){
            int k = entry.getValue();
            while(k-- >0) System.out.print(entry.getKey()+" ");
        }
        System.out.println();
    }
}
