import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Meet> meets = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meets.add(new Meet(start, end));
        }
        Collections.sort(meets, (m1, m2) -> {
            if (m1.end == m2.end) return Integer.compare(m1.start, m2.start);
            return Integer.compare(m1.end, m2.end);
        });        
        int time = 0;
        int count = 0;
        for (int i = 0; i < meets.size(); i++) {
            Meet meet = meets.get(i);
            if(meet.start >= time){
                count++;
                time = meet.end;
            }
        }
        System.out.println(count);
    }

    static class Meet{
        int start;
        int end;
        Meet(int start, int end){
            this.start= start;
            this.end= end;
        }
    }

  
}