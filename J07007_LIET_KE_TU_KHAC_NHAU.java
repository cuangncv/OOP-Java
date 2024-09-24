import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class J07007_LIET_KE_TU_KHAC_NHAU {
    public static void main (String [] args){
        try {
            FileInputStream file = new FileInputStream("VANBAN.in");
            Scanner in = new Scanner(file);
            Set<String> se = new TreeSet<>();
            while(in.hasNextLine()){
                String s = in.nextLine();
                String [] a = s.trim().split("\\s+");
                for(String x : a){
                    x = x.toLowerCase();
                    se.add(x);
                }
            }
            for(String word : se){
                System.out.println(word);
            }
            in.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
