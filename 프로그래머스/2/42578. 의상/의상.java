import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> maps = new HashMap<>();
        int answer = 1;
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1]; 
            maps.put(type, maps.getOrDefault(type, 0) + 1);
        }
        
        for(String key: maps.keySet()){
            answer *= (maps.get(key) + 1);
        }
        
        return answer - 1;
    }
}