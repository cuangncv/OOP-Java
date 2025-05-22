import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Pairr implements Comparable<Pairr>{
    private String key;
    private int value;

    public Pairr(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public int compareTo(Pairr other){
        if(this.value == other.value) return this.key.compareTo(other.key);
        return Integer.compare(other.value, this.value);
    }
    @Override
    public String toString(){
        return key + " " + value;
    }
}
public class J07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        Map<String, Integer> map = new HashMap<>();
        for(String line : list) {
            String[] words = line.trim().toLowerCase().split("[^a-z0-9]+");
            for(String word : words) {
                if(!word.isEmpty()) {
                    if(!map.containsKey(word)) map.put(word, 1);
                    else map.put(word, map.get(word) + 1);
                }
            }
        }

        ArrayList<Pairr> lt = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            Pairr p = new Pairr(entry.getKey(), entry.getValue());
            lt.add(p);
        }
        Collections.sort(lt);
        for(Pairr p : lt) System.out.println(p);
    }
}