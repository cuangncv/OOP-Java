import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        String s = "";
        while(in.hasNextLine()){
            s += in.nextLine();
            s += " ";
        }
        String [] a = s.trim().split("\\s+");
        List<String> lt = new ArrayList<>();
        for(String x : a){
            try {
                Integer.parseInt(x);
                continue;
            }
            catch (NumberFormatException e){
                lt.add(x);
            }
        }
        Collections.sort(lt);
        for(String z : lt){
            System.out.print(z + " ");
        }
        in.close();
    }
}
