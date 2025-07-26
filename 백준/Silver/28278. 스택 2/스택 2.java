import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int length = sc.nextInt();
        int[] result = new int[length];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            int n = sc.nextInt();

            if (n == 1) {
                int n2 = sc.nextInt();
                stack.push(n2);
            } else if (n == 2) {
                result[idx++] = stack.empty() ? -1 : stack.pop();
            } else if (n == 3) {
                result[idx++] = stack.size();
            } else if (n == 4) {
                result[idx++] = stack.empty() ? 1 : 0;
            } else if (n == 5) {
                result[idx++] = stack.empty() ? -1 : stack.peek();
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.println(result[i]);
        }
    }
}