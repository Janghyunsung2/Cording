import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int totalWeight = 0; 
        int index = 0; 

    
        Deque<int[]> bridge = new ArrayDeque<>();

        while (index < truck_weights.length || !bridge.isEmpty()) {
            time++; 

            if (!bridge.isEmpty()) {
                for (int[] truck : bridge) {
                    truck[1]--;
                }
                if (bridge.peekFirst()[1] == 0) {
                    totalWeight -= bridge.pollFirst()[0];
                }
            }

            if (index < truck_weights.length) {
                int nextTruck = truck_weights[index];
                if (totalWeight + nextTruck <= weight && bridge.size() < bridge_length) {
                    bridge.addLast(new int[]{nextTruck, bridge_length});
                    totalWeight += nextTruck;
                    index++;
                }
            }
        }

        return time;
    }
}