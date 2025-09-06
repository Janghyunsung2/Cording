import java.util.*;

public class Main {

    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int maxWeight = sc.nextInt();
        Item[] items = new Item[length+1];
        dp = new int[length + 1][maxWeight + 1];
        

        for (int i = 1; i <= length; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            Item item = new Item(w, v);
            items[i] = item;
        }

        for (int i = 1; i <= length; i++) {
            for (int w = 1; w <= maxWeight; w++) {
                if (items[i].weight <= w) {
                    dp[i][w] = Math.max(
                        dp[i - 1][w],  // 담지 않는 경우
                        dp[i - 1][w - items[i].weight] + items[i].value // 담는 경우
                    );
                } else {
                    dp[i][w] = dp[i - 1][w]; // 담을 수 없음
                }
            }
        }

  
        System.out.println(dp[length][maxWeight]);

        
    }

    static class Item {
        int weight;
        int value;

        Item(int weight, int value){
            this.weight = weight;
            this.value = value;
        }
        
    }



  
}