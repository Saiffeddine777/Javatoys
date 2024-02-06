package Old;
import java.util.ArrayList;

public class Sum {
 /*Given two integers a and b, which can be positive or negative, 
  find the sum of all the integers between and including them and 
 return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
Your function should only return a number, not the explanation about how you get that number.
 */
    public int getSum(int a,int b){

      //size ABS of it
      //conditions to dertmine wich one will be incremeted
      int incremeted =0;
      int limit = 0;
      if (b>a){
           incremeted =a;
           limit =b;
      }
      else if(b<a){
            incremeted =b;
            limit =a;
      }
      else if(a==b){
         return a;
      }


       ArrayList<Integer> ArrayOfNumbers = new ArrayList<>();
       int size= Math.abs((limit-incremeted)) +1;
       int sum = 0;
        
       while(ArrayOfNumbers.size()<size){
        ArrayOfNumbers.add(incremeted);
        incremeted++;
       }
       System.out.println(ArrayOfNumbers);

       for(int number: ArrayOfNumbers ){
          sum += number; 
       }
        return sum;
    }
    public static void main(String[] args){
      Sum x = new Sum();
      System.out.println(x.getSum(1,4));
    }
}