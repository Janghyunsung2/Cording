import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardLength = sc.nextInt();
        int maxNumber = sc.nextInt();
        int[] cards = new int[cardLength];

        int answer = 0;

        for (int i = 0; i < cardLength; i++) {
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < cardLength - 2; i++) {
            for (int j = i + 1; j < cardLength - 1; j++) {
                for (int k = j + 1; k < cardLength; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= maxNumber) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }


        System.out.println(answer);
    }
  
}