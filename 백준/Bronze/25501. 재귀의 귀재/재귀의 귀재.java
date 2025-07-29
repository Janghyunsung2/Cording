import java.util.*;;
public class Main {

    static int count;

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        count = 0; // 초기화
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String input = sc.nextLine();
            int result = isPalindrome(input);
            System.out.println(result + " " + count);
        }
    }
}