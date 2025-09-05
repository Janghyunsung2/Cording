import java.util.*;;
public class Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int month = sc.nextInt();
       int day = sc.nextInt();
       int dayCount = day;
       int[] dayMax = new int[]{31, 28, 31,30,31,30,31,31,30,31,30,31};
       String[] dayNames = new String[]{"MON","TUE", "WED","THU","FRI", "SAT", "SUN"};
       for (int i = 0; i < month-1; i++) {
            dayCount += dayMax[i];
       }

       int dayIndex = dayCount % 7;
       if(dayIndex == 0){
            dayIndex = 7;
       }

       System.out.println(dayNames[dayIndex-1]);


   }
}