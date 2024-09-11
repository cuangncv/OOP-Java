import java.util.Scanner;
import java.util.Stack;

public class J08021_DAY_NGOAC_DUNG_DAI_NHAT {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String s = in.nextLine();
            Stack<Integer> st = new Stack<>();
            int maxx = 0;
            st.push(-1);
            System.out.println(daiNhat(s,st,maxx));
        }
        in.close();
    }
    public static int daiNhat (String s, Stack<Integer> st, int maxx){
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(') st.push(i);
            else{
                st.pop();
                if(!st.isEmpty()) maxx = Math.max(maxx,i-st.peek());
                else st.push(i);
            }
        }
        return maxx;
    }
}
