import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * MostFrequentElement
 */
public class MostFrequentElement {

  public Optional<Integer> mostFrequentElement (List<Integer> numbers){

    if (numbers.isEmpty()){
      return Optional.empty();
    }

    Map<Integer , Integer> frequanciesMap = new HashMap<>();

    numbers.forEach((item) -> {
      if (frequanciesMap.containsKey(item)){
        frequanciesMap.put(item , frequanciesMap.get(item)+1);
      }
      else {
        frequanciesMap.put(item, 1); 
      }
    });


    int max = 0;
    int key = numbers.get(0);

    for(int num : numbers){
      int frequancy = frequanciesMap.get(num);

      if (frequancy > max ){
        max = frequancy;
        key =num;
      }
    }

    return Optional.of(key);

  }
  public static void main(String[] args) {

  }

    
}