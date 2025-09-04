import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];
        int n = result.length;
        for (int i = 0; i < result.length; i++) {
            while (!stack.empty() && prices[i] < prices[stack.peek()])  {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            int idx = stack.pop();
            result[idx] = n - 1 - idx;
        }
        
        
        return result;
    }
}