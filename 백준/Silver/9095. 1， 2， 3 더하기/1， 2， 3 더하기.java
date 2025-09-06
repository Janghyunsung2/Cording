import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] dp = new int[11];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i < length; i++) {
            System.out.println(dp[arr[i]]);
        }
        
    }



  
}