import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long result = factorier(num);

        System.out.println(result);
        
    }


    private static long factorier(int num1){
        if (num1 <= 1) return 1; 
        return num1 * factorier(num1-1);
    }
}
