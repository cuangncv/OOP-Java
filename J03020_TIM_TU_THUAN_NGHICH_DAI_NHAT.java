import java.util.*;

public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = "";
        while(in.hasNextLine()) {
            s += in.nextLine();
            s += " ";
        }
        String [] a = s.trim().split("\\s+");
        timTu(a);
        in.close();
    }
    public static void timTu(String [] a){
        Map<String,Integer> mp = new LinkedHashMap<>();
        int maxx = 0;
        for(int i = 0; i < a.length; i++){
            if(thuanNghich(a[i])){
                if(a[i].length() > maxx){
                    maxx = a[i].length();
                    mp.clear();
                    mp.put(a[i],1);
                }
                else {
                    if (a[i].length() == maxx) {
                        if (mp.containsKey(a[i])) {
                            int k = mp.get(a[i]) + 1;
                            mp.put(a[i], k);
                        } else mp.put(a[i], 1);
                    }
                }
            }
        }
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static boolean thuanNghich (String p){
        StringBuilder sb = new StringBuilder(p);
        String x = sb.reverse().toString();
        if(x.equals(p)) return true;
        return false;
    }
}