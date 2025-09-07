import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;


        while (i <= 10000) {
            if(!isConstruct(i)) System.out.println(i);
            i++;
        }
    }


    static boolean isConstruct(int num) {
        for (int i = 1; i < num; i++) { 
            int sum = i;
            int tmp = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (sum == num) {
                return true;
            }
        }
        return false; 
    }
  
}