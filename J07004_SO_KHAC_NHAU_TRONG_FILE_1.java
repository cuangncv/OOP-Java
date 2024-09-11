import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004_SO_KHAC_NHAU_TRONG_FILE_1 {
    public static void main (String [] args){
        try {
            FileInputStream file = new FileInputStream("DATA.in");
            Scanner in = new Scanner(file);
            Map<Integer,Integer> mp = new TreeMap<>();
            while(in.hasNextInt()){
                int x = in.nextInt();
                if(mp.containsKey(x)){
                    int q = mp.get(x) + 1;
                    mp.put(x,q);
                }
                else mp.put(x,1);
            }
            for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
            in.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
