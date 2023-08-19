
import java.util.ArrayList;

public class Test{

    static boolean isPrime(int number){
        if (number ==2 || number ==3){
          return true;
        }
        else if(number %3==0 || number%2==0 ){
          return false;
        }
        for (int i = 5 ; i*i<=number;i=i+6){
          if(number%i==0 || number%2==0){
            return false;
          }
        }
        
        return true;
    }

    public static void main (String args[]){
          System.out.println(isPrime(12));
    }
}