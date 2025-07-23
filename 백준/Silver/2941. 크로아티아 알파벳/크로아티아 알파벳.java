import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        List<String> croatiaAlphabets = Arrays.asList(
                "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
        );

        for (String ca : croatiaAlphabets) {
            word = word.replace(ca, "*");
        }

        System.out.println(word.length());
    }
}