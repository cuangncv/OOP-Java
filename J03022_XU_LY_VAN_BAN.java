import java.util.Scanner;

public class J03022_XU_LY_VAN_BAN {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = "";
        while (in.hasNextLine()){
            s += in.nextLine();
        }
        xuLy(s);
        in.close();
    }
    public static void xuLy (String s){
        String [] words = s.split("[.!?]");
        for(String x : words){
            x = x.toLowerCase();
            String [] word = x.trim().split("\\s+");
            System.out.print(word[0].substring(0,1).toUpperCase()+word[0].substring(1)+" ");
            for(int i = 1; i < word.length; i++){
                System.out.print(word[i]+" ");
            }
            System.out.println();
        }
    }
}
