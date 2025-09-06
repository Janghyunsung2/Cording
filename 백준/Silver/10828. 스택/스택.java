import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            String[] process = sc.nextLine().split(" ");
            String stackProcess = process[0];
            if("push".equals(stackProcess)){
                int number = Integer.parseInt(process[1]);
                stack.push(number);
            }else if("pop".equals(stackProcess)){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            }else if("size".equals(stackProcess)){
                System.out.println(stack.size());
            }else if("empty".equals(stackProcess)){
                System.out.println(stack.isEmpty() ? 1:0);
            }else if("top".equals(stackProcess)){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
        
        
    }



  
}