
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates{


    public List<Integer> removeDuplicates(List<Integer> numbers ){
        Set<Integer> uniques = new LinkedHashSet<>(numbers);
        return List.copyOf(uniques);
    }
    public static void main (String [] args){

    }
}