import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    

        List<Integer> result = new ArrayList<>();

        int length = progresses.length;
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            int work = 100 - progresses[i];
            arr[i] = (int) Math.ceil((double) work / speeds[i]);
        }
        int count = 1;
        int Max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= Max){
                count++;
            }else{
                result.add(count);
                count = 1;
                Max = arr[i];
            }
        }
        result.add(count);

        return result.stream().mapToInt(Integer::intValue).toArray();


    }
}