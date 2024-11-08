import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        String[] list = new String[len];

        for (int i = 0; i < len; i++) {
            list[i] = sc.nextLine();
        }

        // Arrays.sort()를 사용하여 문자열 길이 및 사전순으로 정렬
        Arrays.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length()); // 길이 순으로 정렬
            } else {
                return a.compareTo(b); // 길이가 같을 경우 사전순으로 정렬
            }
        });

        // 중복 제거 및 출력
        String previous = "";
        for (String s : list) {
            if (!s.equals(previous)) {
                System.out.println(s);
                previous = s;
            }
        }
    }
}