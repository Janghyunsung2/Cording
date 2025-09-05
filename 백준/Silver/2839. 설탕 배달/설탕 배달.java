import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = sc.nextInt();
        int count = 0;

        while (goal >= 0) {
            if (goal % 5 == 0) {   // 5로 나눠떨어지면 끝
                count += goal / 5;
                System.out.println(count);
                return;
            }
            goal -= 3;  // 5로 안 나눠지면 3 빼기
            count++;
        }
        System.out.println(-1); // 딱 안 나눠떨어지는 경우
    }
}