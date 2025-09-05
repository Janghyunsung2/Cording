import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : scoville) pq.add(num);
        

        while (!pq.isEmpty() && pq.peek() < K) {
            if(pq.size() < 2) return -1;
            int firstNum = pq.poll();
            int secondNum = pq.poll();
            int newFood = firstNum + (secondNum * 2);
            pq.add(newFood);
            answer++;
        }


        return answer;
        
    }
}