import java.util.Scanner;
import java.util.function.BiFunction;

class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        sc.nextLine();

        BiFunction<Integer, Integer, Long> combination = (n, m) -> {
            if (m > n - m) {
                m = n - m; // nCm과 nC(n-m)은 동일하므로 연산량 줄이기
            }
            long result = 1;
            for (int i = 0; i < m; i++) {
                result *= (n - i);
                result /= (i + 1);
            }
            return result;
        };

        for (int i = 0; i < len; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(combination.apply(M, N));

        }
    }
}
