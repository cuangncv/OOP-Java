import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008_DAY_CON_TANG_DAN {
    public static void main (String [] args){
        try {
            FileInputStream file = new FileInputStream("DAYSO.in");
            Scanner in = new Scanner(file);
            int n = in.nextInt();
            int [] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            ArrayList<String> lt = new ArrayList<>();
            for(int i = 0 ; i < n - 1; i++){
                tangDan(i,1,a[i]+" ", n , a, lt);
            }
            Collections.sort(lt);
            for(String p : lt) System.out.println(p);
            in.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
    public static void tangDan (int i, int x, String s, int n, int [] a, ArrayList<String> lt){
        if(x > 1) lt.add(s);
        for (int j = i + 1; j < n; j++){
            if(a[i] < a[j]) {
                tangDan(j,x+1,s+a[j]+" ",n,a,lt);
            }
        }
    }
}
