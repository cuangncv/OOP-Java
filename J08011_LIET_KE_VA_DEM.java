import java.util.LinkedHashMap;
import java.util.*;

public class J08011_LIET_KE_VA_DEM {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = "";
        while (in.hasNextLine()){
            s += in.nextLine();
            s += " ";
        }
        String [] a = s.trim().split("\\s+");
        int [] e = new int [a.length];
        for(int i = 0; i < a.length; i++) e[i] = Integer.parseInt(a[i]);
        timSo(e);
        in.close();
    }
    public static void timSo(int [] e){
        LinkedHashMap<Integer,Integer> mp = new LinkedHashMap<>();
        for(int i = 0; i < e.length; i++){
            if(khongGiam(e[i])){
                if (mp.containsKey(e[i])) {
                    int k = mp.get(e[i]) + 1;
                    mp.put(e[i], k);
                } else mp.put(e[i], 1);
            }
        }
        List<Map.Entry<Integer,Integer>> lt = new ArrayList<>(mp.entrySet());
        lt.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        LinkedHashMap<Integer,Integer> qu = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : lt){
            qu.put(entry.getKey(), entry.getValue());
        }
        for(Map.Entry<Integer,Integer> entry : qu.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static boolean khongGiam (int p){
        int z = 0;
        int y = 0;
        while(z >= y & p > 10){
           z = p % 10;
           p/=10;
           y = p % 10;
        }
        if (p < 10 && z >=y) return true;
        return false;
    }
}
