

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class FindDuplicate {
        public List<Integer> findDuplicate (List<Integer> numbers){
            HashSet<Integer> seen = new HashSet<Integer>();
            HashSet<Integer> duplicate = new HashSet<Integer>();

            numbers.forEach((element)->{
                if (seen.contains(element)){
                    duplicate.add(element);
                }
                else{
                    seen.add(element);
                }
            });

            return new ArrayList<>(duplicate);
        }
}
