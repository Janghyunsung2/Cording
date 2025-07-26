import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int indx = 0;

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int num = sc.nextInt();
            if(num > 0){
                result[indx++] = num;
            }else if (num == 0){
                result[indx-1] = 0;
                indx--;
            }       
        }

        int sum = 0;

        for (int i : result) {
            sum += i;
        }

        System.out.println(sum);
    }
}
