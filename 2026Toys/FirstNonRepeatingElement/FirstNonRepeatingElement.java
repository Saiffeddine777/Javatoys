import java.util.List;
import java.util.Optional;
/**
 * FirstNonRepeatingElement
 */
public class FirstNonRepeatingElement {

    public Optional<Integer>  firstNonRepeatingElement(List<Integer> numbers){
        int  i = 0;
        while (i<numbers.size()){
            int number = numbers.get(i);
            if (numbers.indexOf(number) == numbers.lastIndexOf(number)){
                return Optional.of(number);
            }
            i++;
        }
        return Optional.empty();
    }
    public static void main (String[] args){

    }
    
}