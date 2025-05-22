import java.io.File;
import java.util.List;
import java.util.*;

public class XU_LY_VAN_BAN_2 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("VANBAN.in"));
        ArrayList<String> lt = new ArrayList<>();
        while(in.hasNextLine()){
            String s = in.nextLine();
            lt.add(s);
        }
        TreeSet<String> arr = new TreeSet<>();
        for(String q : lt){
            String [] a = q.trim().split("\\s+");
            for(int i = 0 ; i < a.length; i++){
                if(a[i].matches(".*\\d.*") && !a[i].matches(".*[.,!?:].*")){
                    arr.add(a[i]);
                }
            }
        }
        for(String p : arr){
            System.out.println(p);
        }
        in.close();
    }
}
