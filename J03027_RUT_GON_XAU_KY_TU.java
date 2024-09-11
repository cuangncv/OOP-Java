import java.util.*;
public class J03027_RUT_GON_XAU_KY_TU {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String key = rutGon(s);
        if(key.length() > 0) System.out.print(rutGon(s));
        else System.out.print("Empty String");
        in.close();
    }
    public static String rutGon (String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else {
                if(s.charAt(i) == st.peek()){
                    st.pop();
                }
                else st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character p : st){
            sb.append(p);
        }
        return sb.toString();
    }
}
