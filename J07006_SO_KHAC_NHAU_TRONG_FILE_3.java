import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07006_SO_KHAC_NHAU_TRONG_FILE_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ob.readObject();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int x : arr){
            if(tm.containsKey(x)){
                tm.put(x, tm.get(x) + 1);
            }
            else tm.put(x, 1);
        }
        for(Map.Entry <Integer, Integer> entry : tm.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        ob.close();
    }
}