import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DOC_FILE_VAN_BAN {
    public static void main (String [] args){
        try {
            FileInputStream file = new FileInputStream("DATA.in");
            Scanner in = new Scanner(file);
            while(in.hasNextLine()){
                String s = in.nextLine();
                System.out.println(s);
            }
            in.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
