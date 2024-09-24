import java.util.Scanner;

public class JKT014_DAU_TU_CHUNG_KHOAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            int[] dp = new int[n];
            for(int i = 0; i < n; i++) {
                dp[i] = 1;
                for(int j = i-1; j >= 0;) {
                    if(a[j] <= a[i]) {
                        dp[i] += dp[j];
                        j -= dp[j];
                    } else break;
                }
            }
            for(int i = 0; i < n; i++) System.out.print(dp[i] + " ");
            System.out.println();
        }
    }
}
//Với mỗi ngày i, khởi tạo dp[i] = 1 (ít nhất là chính ngày đó).
//Kiểm tra các ngày trước đó (j), nếu giá chứng khoán ngày trước đó nhỏ hơn hoặc bằng ngày hiện tại, cộng thêm số ngày liên tiếp của ngày đó (dp[j]) vào dp[i].
//Sau đó, lùi ngược j theo số ngày dp[j] để kiểm tra tiếp, đến khi j = 0