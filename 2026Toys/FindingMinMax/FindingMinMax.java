import java.util.List;

public class FindingMinMax{
    
    public record MinMax(int max , int min) {}

    public MinMax findingMinMax(List<Integer> numbers){
        if (numbers.isEmpty()){
            return null;
        }
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int element : numbers){
            if (element<min){
                min = element;
            }

            if (element>max){
                max =element;
            }
        }
        return new MinMax(max,min);
    }
    
    public static void main (String [] args){

    }
}