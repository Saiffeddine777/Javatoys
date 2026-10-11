import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequancies {
    public Map<Integer, Integer> countFrequancies(List<Integer> numbers){
        Map<Integer , Integer> frequancyMap = new HashMap<>();
        for (int i = 0 ; i<numbers.size() ; i++){
            int num = numbers.get(i);
            if (frequancyMap.containsKey(num)){
               int value =  frequancyMap.get(num) + 1;
               frequancyMap.replace(num, value);
            }
            else frequancyMap.put(num,1);
        }

        return frequancyMap;
    } 

    public static void main(String[] args){

    }
}