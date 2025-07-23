import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char result = '?';
        int max = 0;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(max < value){
                max = value;
                result = entry.getKey();
            }else if(max == value){
                result = '?';
            }
        }
        System.out.println(result);
        
        scanner.close();
        
        

        

    }
    
}
