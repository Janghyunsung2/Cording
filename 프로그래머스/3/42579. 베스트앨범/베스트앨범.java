import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        
        Map<String, Map<Integer, Integer>> maps = new HashMap<>();
        
        
        for(int i = 0; i < genres.length; i++){
            String genre = genres[i];
            Map<Integer, Integer> playMaps = maps.getOrDefault(genre, new HashMap<>());
            playMaps.put(i, plays[i]);
            maps.put(genre, playMaps);
        }
        
        Map<String, Integer> sumMaps = new HashMap<>();
        
        for(String key : maps.keySet()){
            Map<Integer, Integer> playMaps = maps.get(key);
            int sum = 0;
            for(Integer num: playMaps.values()){
                sum += num;
            }
            sumMaps.put(key, sum);        
        }
        
        
        
        List<String> sortedGerne = sumMaps
           .entrySet()
           .stream()
           .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
           .map(e -> e.getKey())
           .collect(Collectors.toList());

        
        List<Integer> result = new ArrayList<>();

        for(String key: sortedGerne){
            Map<Integer, Integer> playMaps = maps.get(key);
            List<Integer> max = playMaps.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
             
            result.addAll(max);
        }
        
        
        

        return result;
    }

  
}