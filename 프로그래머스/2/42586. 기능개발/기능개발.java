import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> progresList = Arrays.stream(progresses).boxed().collect(Collectors.toList());;
        List<Integer> speedList = Arrays.stream(speeds).boxed().collect(Collectors.toList());;
    
        List<Integer> answer = new ArrayList<>();
        while (true) {
            if(progresList.size() <= 0){
                break;
            }
           for(int i=0; i < progresList.size(); i++){
            progresList.set(i, progresList.get(i) + speedList.get(i));
            } 
            int count = 0;
            for (int j = 0; j < progresList.size(); ) {
                if (progresList.get(j) >= 100) {
                    progresList.remove(j);
                    speedList.remove(j);
                    count++;
                    // j++ 하지 않음 → remove하면 다음 원소가 앞으로 땡겨지니까
                } else {
                    break; // 아직 작업 안 끝난 기능 있으면 멈춤
                }
            }
            if (count > 0) {
                answer.add(count);
                count = 0;
            }
        }
        
        return answer;

    }
}  
             