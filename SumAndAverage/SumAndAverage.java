package SumAndAverage;

import java.util.List;

public class SumAndAverage {

    public record SumAndAverageRecord (int sum ,Double avg ){}

     public SumAndAverageRecord sumAndAverageFunc (List <Integer> numbers){
        
        if (numbers ==null || numbers.isEmpty()){
            return new SumAndAverageRecord(0, null);
        }
        int sum = 0;

        for (Integer integer : numbers) {
            sum += integer;
        }

        Double avg =  (double) sum/numbers.size(); 

        return new SumAndAverageRecord(sum, avg);
     }
    public static void main (String[] args){

    }
    
}