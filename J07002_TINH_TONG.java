import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TINH_TONG{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            String s = "";
            while (sc.hasNextLine()) {
                s += sc.nextLine();
                s += " ";
            }
            long key = 0;
            String[] arr = s.split("\\s+");
            for (String str : arr) {
                try {
                    key += Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            System.out.println(key);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
