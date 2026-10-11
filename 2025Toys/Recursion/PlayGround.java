

public class PlayGround {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int count8(int n) {
       if (n!=8  && n<10){
          return 0;
       }
       else {
           if(n%10==8){
             return 1 + count8(n/10);
           }
           else return count8(n/10);
       }
    }

    public String allStar(String str) {
        if (str.length()==0){
            return "";
        }else if(str.length()==1){
            return str.charAt(0)+"";
        }
        else return str.charAt(0)+"*"+allStar(str.substring(1));
    }
    
    public int powerN(int base, int n) {
        if (n ==0) return 1;
        else{
         return base * powerN(base , n -1);
        }
     }
 
     public int triangle(int rows) {
         if (rows==0) return 0;
         else if (rows ==1 ){
              return 1;
         } 
         else {
             return triangle(rows-1) +rows;
         }
     }
     
     public int count7(int n) {
           if (n==0){
             return 0;
           }
           else if (n%10==7){
              return 1 + count7(n/10);
           }
           else return count7(n/10); 
     }
    

     public int bunnyEars(int bunnies) {
         if (bunnies == 0) {
            return 0;
         }

         return 2+ bunnyEars(bunnies-1);
     }

     public int fibonacci(int n) {
         if (n==0) return  0;
         else if (n==1) return 1;
         else{
            return fibonacci(n-1) + fibonacci(n-2);
         }
     }

     public int bunnyEars2(int bunnies) {
         if(bunnies == 0) return 0;
         else {
            if (bunnies%2==0){
                return 3+bunnyEars2(bunnies-1);
            }
            return 2+bunnyEars2(bunnies-1);
         }  
     }
    //  public int sumDigits(int n) {
    //      if( n==0 ){
    //        return 0;
    //      }
    //      if()
    //  }

    public int countX(String str) {
       if (str.equals("")){
         return 0;
       }
       else if (str.toLowerCase().charAt(0)!='x'){
            return countX(str.substring(1, str.length()));
       }
       else{
          return 1 +countX(str.substring(1, str.length()));
       }
    }

    public String changePi(String str) {
       if (str.equals("") ||str.length()<2 ){
            return str;
        }
       else if (str.substring(0, 2).toLowerCase().equals("pi")){
            return "3.14"+ changePi(str.substring(2, str.length()));
       }
       else {
           return str.substring(0, 1) +changePi(str.substring(1, str.length()));
       }
    }
    
    public int strCount(String str, String sub) {
        if (str.isEmpty() || str.length()<sub.length()){
            return 0;
        }
        else if(str.substring(0, sub.length()).equals(sub)){
            return 1 + strCount(str.substring(sub.length(), str.length()) ,sub);
        }
        else{
            return  strCount(str.substring(1, str.length()) ,sub);
        }
    }
    
    public String endX(String str) {
       if (str.length()<2){
          return str ;
       } 
       else if (str.charAt(0)=='x'){
          return endX(str.substring(1, str.length())) +"x";
       }
       else{
          return str.charAt(0) + endX(str.substring(1, str.length()));
       }
    }
    
    public int array11(int[] nums, int index) {
         if (nums.length==0 ||index >= nums.length){
            return 0;
         }
         else{
            if (nums[index] == 11){
               return 1 + array11(nums, index +1);
            }
            return  array11(nums, index +1);
         }
    }
 
  
    public String noX(String str) {
       if (str.equals("") || str.equals("x")){
         return "";
       }
       else if (str.length()==1 && !str.equals("x")){
           return str;
       }
       else if (str.charAt(0) == 'x'){
          return "" + noX(str.substring(1 , str.length())); 
       }
       else return str.charAt(0) + noX(str.substring(1, str.length()));
    }
    
    public String stringClean(String str) {
        if (str.equals("") || str.length()==1){
            return str ;
        }  
        else {
            int it = 0 ;
            String acc = "";
            while( it <str.length() && str.charAt(it)==str.charAt(0)){
                acc = acc + str.charAt(it);
                it++;
            }

            if (acc.length()==1){
                return str.charAt(0) + stringClean(str.substring(1, str.length()));
            }
            else{
                return str.charAt(0) + stringClean(str.substring(it, str.length()));
            }
        }
    }
    
    public String changeXY(String str) {
        if (str.length() == 0){
            return "";
        }
        else if (str == String.valueOf("x")){
            return  String.valueOf("y");
        }
        else if(str == String.valueOf("x") && str.length()==1){
           return str;
        }
        else {
            if (str.charAt(0)=='x'){
                return 'y' + changeXY(str.substring(1, str.length()));
            }
            else {
                return str.charAt(0) + changeXY(str.substring(1, str.length()));
            }
        }
    }
    public int countHi(String str) {
        if(str.length() <= 1 ){
            return 0;
        }

        else if (str.charAt(0)=='h'&&str.charAt(1)=='i'){
            return 1 + countHi(str.substring(2));
        }
        else{
            return countHi(str.substring(1));
        }
    }


    public int sumDigits(int n) {
        if ((n/10) < 1){
            return n; 
        }
        else{
            return n%10 + sumDigits(n/10);
        }
    }   
     
    public static void main(String[] args) {
       System.out.println(new PlayGround().count8(88788) );
    } 
}