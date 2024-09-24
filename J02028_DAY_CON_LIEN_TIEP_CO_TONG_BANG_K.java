import java.util.Scanner;

public class J02028_DAY_CON_LIEN_TIEP_CO_TONG_BANG_K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            long sum = 0;
            int l = 0, r = 0, check = 0; // l là con trỏ trái, r là con trỏ phải của dãy con
            while(r < n) {
                sum += a[r]; // Lùi dần r sang phải để cộng vào sum
                while (sum > k) {
                    sum -= a[l]; // Lùi dần l sang phải để trừ bớt sum đi
                    l++;
                }
                if(sum == k && sum != 0) { // Tìm dc dãy con l, r có tổng bằng k
                    check = 1;
                    break;
                }
                if(sum == 0 && a[r] == 0) { // TH đặc biệt khi sum = 0 và có phần tử = 0
                    check = 1;
                    break;
                }
                r++;
            }
            System.out.println(check == 1 ? "YES" :  "NO");
        }
        in.close();
    }
}