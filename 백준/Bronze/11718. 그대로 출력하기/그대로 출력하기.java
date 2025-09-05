import java.util.*;;
public class Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       List<String> arr = new ArrayList<>();
       while (true) {
            if(sc.hasNextLine()){
                arr.add(sc.nextLine());
            }else{
                for (String string : arr) {
                    System.out.println(string);
                }
                break;
            }
       }

       
       
        

   }
}