package SumAndAverage.EvenAndOdd;

import java.util.List;

public class EvenAndOdd {

    public record EvenAndOddRecord (int odd , int even){}

    public EvenAndOddRecord evenAndOddfunction(List<Integer> numbers){
        if (numbers.size()==0){
            return new EvenAndOddRecord(0, 0);
        }
        int odd =0;
        int even = 0;
        for (Integer integer : numbers) {
            if (integer %2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new EvenAndOddRecord(odd, even);
    }
    public static void main ( String [] args){

    }
    
}