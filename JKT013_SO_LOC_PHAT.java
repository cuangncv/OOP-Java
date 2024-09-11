import java.util.*;

public class JKT013_SO_LOC_PHAT {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int N = in.nextInt();
            List<String> lt = new ArrayList<>();
            lt.add("6");
            lt.add("8");
            int k = 0;
            while(lt.get(k).length() < N){
                lt.add(lt.get(k)+"6");
                lt.add(lt.get(k)+"8");
                k++;
            }
            System.out.println(lt.size());
            for(int i = lt.size() - 1; i >= 0; i--){
                System.out.print(lt.get(i)+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
