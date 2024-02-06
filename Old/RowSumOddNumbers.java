package Old;
import java.util.Stack;
public class RowSumOddNumbers{
    /*
    Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
 Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

 1 -->  1
 2 --> 3 + 5 = 8
*/
    
     
    public static int rowSumOddNumbers(int n){;
       int copy = n; 
       int quantity = 0;
       while(n>0){
        quantity+=n;
        n--;
       }
       System.out.println(quantity);
       Stack<Integer> numbers = new Stack<> ();
       int result = 0;
       int number =1;
       int count = quantity;
       while (count>0){
        numbers.push(number);
         number +=2;
         count--;
       }
       System.out.println(numbers);
       int popping = quantity - copy;
       int counter =0;
       System.out.println(popping);
       while (popping>=0){
           if(counter == copy){
            break;
           }
           int add = numbers.pop();
           result+=add;
           popping--;
           counter++;
       }
       
       return result;
    }

    public static void main(String args[]){
       System.out.println(RowSumOddNumbers.rowSumOddNumbers(42));
    }
}