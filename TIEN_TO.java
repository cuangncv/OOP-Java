import java.util.Scanner;
import java.util.Stack;

public class TIEN_TO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int N = in.nextInt();
            Stack<String> st1 = new Stack<>();
            Stack<Integer> st2 = new Stack<>();
            String [] a = new String[N];
            for(int i = 0; i < N; i++){
                a[i] = in.next();
            }
            for(int i = N-1; i >=0; i--){
                if(a[i].equals("+") || a[i].equals("-") || a[i].equals("*") || a[i].equals("/")){
                    if(st2.size() > 1 ){
                        int x = st2.pop();
                        int y = st2.pop();
                        int result = 0;
                        switch (a[i]) {
                            case "+":
                                result = x + y;
                                break;
                            case "-":
                                result = x - y;
                                break;
                            case "*":
                                result = y * x;
                                break;
                            case "/":
                                result = x / y;
                                break;
                        }
                        st2.push(result);
                    }
                    st1.push(a[i]);
                }
                else st2.push(Integer.parseInt(a[i]));
            }
            System.out.println(st2.pop());
        }
    }
}
