package WarmUpS2;

public class PlayGround{
    public String stringTimes(String str, int n) {
        if(n>0){
            String acc = "";
           for (int i = 1; i<=n; i++){
            acc = acc+str ;
           }
           return acc;
        }
        return "";
    }


    public String frontTimes(String str, int n) {
        if(str.length()<=3){
            String sub = str.substring(0,str.length());
            if (n>0){
                int i= 1 ;
                String acc = "";
                while (i<=n){
                  acc = acc + sub;
                  i++;
                }
                return acc;
            }
        }
        else{
            String sub = str.substring(0,3);
            if (n>0){
                int i= 1 ;
                String acc = "";
                while (i<=n){
                  acc = acc + sub;
                  i++;
                }
               return acc;
            }
        }
        return "";
    }


    int countXX(String str) {
        if (str.contains("x")){
            int count =-1;
            for (int i = 0 ; i < str.length() ;i++ ){
                 if(str.charAt(i)=='x'){
                     count++;
                 }
                 if (str.charAt(i)==' '){
                    count--;
                 }
             }
             return count;
        }
        else {
            return 0;
        }
    }

    boolean doubleX(String str) {
        if (str.length()==0){
            return false;
        }
        boolean found = false;
        int i = 1; 
        int xcounter = str.charAt(0)=='x'? 1:0;
        while (!found &&  i<str.length()){
            if(str.charAt(i)=='x') xcounter++;
            if (str.charAt(i)=='x' && str.charAt(i-1)=='x' && xcounter==2){
                found = true;
            }
            i++;
        }
        return found;
    }
    

    public String stringBits(String str) {
        if(str.length()!=0){
           String acc = "";
          for(int i = 0 ; i<str.length(); i=i+2){
             acc =acc +str.charAt(i);
          }
          return acc;
        }
        return "";  
    }

    public String stringSplosion(String str) {
       if(str.length()!=0){
        int i =0;
        String acc = "";
        while(i<str.length()){
           acc = acc.concat(str.substring(0,i+1));
          i++;
        }
        return acc;

       }
       return "";
    }


    public int last2(String str) {
        if (str.length()==1){
            return 0;
        }
        if (str !=""){
            String testable = str.substring(str.length()-2,str.length());
            int number = 0;
            for (int i = 0 ; i<str.length()-2;i++){
               String testing = str.substring(i, i+2);
            //    System.out.println(testing);
               if(testable.equals(testing)){
                   number++;
               } 
            }
            return number;
        }
      return 0;
    }  

    public int arrayCount9(int[] nums) {
         int count9=0;
        for (int i : nums) {
            if(i==9){
                count9 ++;
            }
        } 
        return count9;
    }
    

    public boolean array123(int[] nums) {
        
        for (int i = 0 ; i<nums.length-2; i++){
              if(nums[i] == 1 &&nums[i+1] == 2&&nums[i+2] == 3){
                return true;
              }
        }
        return false;
    }


    public boolean arrayFront9(int[] nums) {

         for ( int i  = 0 ; i<nums.length ; i++){
             if ( i <4 && nums[i] == 9){
                  return true;
             }
         }

        return false;
    }   

    public int stringMatch(String a, String b) {

        if (a.length() <=b.length()){
            int count = 0 ; 
           for (int i = 0 ; i<a.length()-1; i++ ){
              String subA  = a.substring(i, i+2);
              String subB  = b.substring(i, i+2);
              if (subA.equals(subB)){
                count++;
              } 
           } 
           return count;
        }
        else if(a.length()>b.length()) {
            int count = 0 ; 
           for (int i = 0 ; i<b.length()-1; i++ ){
              String subA  = a.substring(i, i+2);
              String subB  = b.substring(i, i+2);
              if (subA.equals(subB)){
                count++;
              } 
           } 
           return count;
        }       
        return 0;
    }

    public String stringX(String str) {
        String acc = "";
        for(int i =0 ; i <str.length() ; i++){
           if ((i == 0 || i == str.length() - 1) && str.charAt(i) == 'x'){
              acc =acc+'x';
           }else if (str.charAt(i)!='x'){
              acc=acc+str.charAt(i);
           }
        }
        return acc;
    }
    
    public String altPairs(String str) {
        boolean either3or1 = true;
        String acc = "";
        int index = 0;
        while(index<str.length()){
           acc = acc + str.charAt(index);
           if(either3or1){
             index++;
           }
           else{
            index = index+3;
           }
           either3or1 =!either3or1;
        }
        return acc;
    }
    
    public String stringYak(String str) {
    
      if (str.contains("yak")){
         String withOutYak = str.replace("yak", "");
         return withOutYak;
      }
      return str;
    }


    public int array667(int[] nums) {
        int count = 0;
        for(int i = 0 ; i <nums.length-1 ; i++){
          if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] ==7)){
             count++; 
          }
        } 
        return count;
    }
    
    public boolean noTriples(int[] nums) {
        for(int i  = 0 ; i<nums.length-2 ;i++ ){
            if(nums[i] == nums[i+1]&& nums[i]==nums[i+2]){
                return false;
            }
        }
      return true;  
    }
    
  
    public boolean has271(int[] nums) {
        for(int i  = 0 ; i<nums.length-2 ;i++ ){
           boolean validIndexplus1 = nums[i+1] - nums[i] == 5;
           boolean validIndexPlus2 = nums[i+2] == nums[i] -1 ||(nums[i+2]<=(nums[i] -1)+2  && nums[i+2]>=(nums[i] -1)-2);
           if (validIndexPlus2&&validIndexplus1){
             return true;
           }

        }
         return false;
    }
    
    public static void main (String[] args){
       System.out.println(new PlayGround().stringMatch("hello", "he"));
    }
}