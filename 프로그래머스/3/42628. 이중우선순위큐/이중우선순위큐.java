import java.util.PriorityQueue;
import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(String oper: operations){
            if(oper.contains("I")){
                String[] numStr = oper.split(" ");
                Integer num = Integer.valueOf(numStr[1]);
                minHeap.add(num);
                maxHeap.add(num);
            }else if(oper.contains("D") && !minHeap.isEmpty()){
                String[] numStr = oper.split(" ");
                Integer num = Integer.valueOf(numStr[1]);
                if(num > 0){
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }else {
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
            
        }
        if(minHeap.isEmpty()){
           return new int[2]; 
        }
        int[] answer = new int[2];
        
        return new int[]{maxHeap.peek(), minHeap.peek()};
    }
}