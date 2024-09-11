import java.util.Scanner;
public class J02103_TICH_MATRAN_VOI_CHUYENVI_CUA_NO{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int c = 1 ; c <= t ;c++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] matrix = new int[n][m];
            int[][] trans_matrix = new int[m][n];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++) {
                    matrix[i][j] = in.nextInt();
                    trans_matrix[j][i] = matrix[i][j];
                }
            }
            System.out.println("Test " + (c) + ":");
            int [][]key = new int[n][n];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    key[i][j] = 0;
                    for(int x = 0;x < m;x++){
                        key[i][j] += matrix[i][x] * trans_matrix[x][j];
                    }
                    System.out.print(key[i][j] + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}