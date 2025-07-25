import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Map<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F", 0.0);

        String grade = "";
        Double value = 0.0;

        double result = 0.0;

        Double sumScore = 0.0;

        
        for (int i = 0; i < 20; i++) {
            String[] line = sc.nextLine().split(" ");
            grade = line[2];
            if(grade.equals("P")){
                continue;
            }
            Double value2 = score.get(grade);
            value = Double.valueOf(line[1]);
            result += value * value2;
            sumScore += value;
        }

        result = result/sumScore;

        System.out.println(result);
    }
}
