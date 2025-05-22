import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> lt = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>(Comparator.reverseOrder());
        Collections.sort(lt);
        int cnt = 0;
        for(int i = lt.size() - 1; i >=0; i--){
            if(soNT(lt.get(i))) {
                if (tm.containsKey(lt.get(i))) {
                    int k = tm.get(lt.get(i));
                    tm.put(lt.get(i), k + 1);
                } else tm.put(lt.get(i), 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
            cnt++;
            if(cnt > 10) break;
        }
        in.close();
    }
    public static boolean soNT (int k){
        if( k < 2) return false;
        for(int i = 2; i <= Math.sqrt(k); i++){
            if(k % i == 0) return false;
        }
        return true;
    }
}
