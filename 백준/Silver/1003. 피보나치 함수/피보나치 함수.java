import java.util.Scanner;

public class Main {

    static int[][] memo = new int[41][2]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] result = new String[len];

 
        memo[0][0] = 1; memo[0][1] = 0;
        memo[1][0] = 0; memo[1][1] = 1;

        for (int i = 0; i < len; i++) {
            int num = sc.nextInt();
            int[] res = fibo(num);
            result[i] = res[0] + " " + res[1];
        }

        for (String string : result) {
            System.out.println(string);
        }
    }

    static int[] fibo(int n) {
        if (memo[n][0] != 0 || memo[n][1] != 0 || n == 0 || n == 1) {
            return memo[n];
        }
        int[] left = fibo(n - 1);
        int[] right = fibo(n - 2);
        memo[n][0] = left[0] + right[0];
        memo[n][1] = left[1] + right[1];
        return memo[n];
    }
}