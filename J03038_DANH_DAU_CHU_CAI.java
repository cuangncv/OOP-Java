import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class J03038_DANH_DAU_CHU_CAI {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(soCC(s));
        in.close();
    }
    public static int soCC (String s){
        Set<Character> se = new HashSet<>();
        for(Character x : s.toCharArray()){
            se.add(x);
        }
        return se.size();
    }
}
