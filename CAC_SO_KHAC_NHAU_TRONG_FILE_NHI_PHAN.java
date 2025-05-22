import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class CAC_SO_KHAC_NHAU_TRONG_FILE_NHI_PHAN {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds = (ArrayList<String>) in.readObject();
        TreeSet<Integer> se = new TreeSet<>();
        for(String x : ds){
            String [] a = x.trim().split("\\s+");
            for(int i = 0 ; i < a.length; i++) {
                try {
                    se.add(Integer.parseInt(a[i]));
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }
        for(int q : se){
            System.out.println(q);
        }
    }
}
