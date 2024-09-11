import java.util.Scanner;
import java.util.Stack;

public class J08020_KIEM_TRA_DAY_NGOAC_DUNG {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            Stack<Character> st = new Stack<>();
            System.out.println(kiemTra(s,st));
        }
        in.close();
    }
    public static String kiemTra (String s, Stack<Character> st){
        for (Character x : s.toCharArray()){
            if(st.isEmpty() || x == '(' || x == '{' || x == '[') st.push(x);
            else {
                if (x == ')'){
                    if(st.peek() != '(') return "NO";
                    else st.pop();
                }
                if (x == '}'){
                    if(st.peek() != '{') return "NO";
                    else st.pop();
                }
                if (x == ']'){
                    if(st.peek() != '[') return "NO";
                    else st.pop();
                }
            }
        }
        if(!st.isEmpty()) return "NO";
        return "YES";
    }
}
