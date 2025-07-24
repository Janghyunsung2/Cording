import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        int result = 0;

        for (int i = 0; i < num; i++) {
            String word = sc.nextLine();
            boolean[] seen = new boolean[26];
            boolean isGroupWord = true;

            char prev = '\0';

            for (char c : word.toCharArray()) {
                if (c != prev) {
                    if (seen[c - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    seen[c - 'a'] = true;
                }
                prev = c;
            }

            if (isGroupWord) {
                result++;
            }
        }

        System.out.println(result);
    }
}