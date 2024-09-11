import java.util.*;
public class J01008_PHANTICH_THUASO_NGUYENTO {
    public static void main(String[] args){
        Scanner qu= new Scanner(System.in);
        int t= qu.nextInt();
        for(int i=0;i<t;i++){
            long a= qu.nextLong();
            System.out.printf("Test %d: ",i+1);
            for(int j=2;j<=Math.sqrt(a);j++){
                int key=0;
                while(a%j==0){
                    key++;
                    a/=j;
                }
                if(key>0) System.out.printf(j+"("+key+") ");
            }
            if(a>1) System.out.printf(a+"(1)");
            System.out.println("");
        }
    }
}
