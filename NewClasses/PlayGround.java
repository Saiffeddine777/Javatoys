package NewClasses;


public class PlayGround{
    public int sumDouble(int a, int b) {
        if(a == b) {
            return 2 *(a+b);
        }
        else return a+b;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour >20 || hour <7)){
            return true;
        }
      return false;
    }
     
    public boolean makes10(int a, int b) {
        if (a+b == 10 || a ==10 ||b ==10){
            return true;
        }
        else return false;
       
    }   
    

    public boolean posNeg(int a, int b, boolean negative) {
      if ((negative == false &&(( a<0 && b >0 ) ||( a>0 && b<0 ) )) ||(negative == true && a<0 && b <0 )){
           return true;
      }
      return false;
    }

    public String notString(String str) {   
        if ( ! str.startsWith("not")){
            return "not " + str;  
        }
        else return str;
    } 

    public String missingChar(String str, int n) {
         if (n == 0){
            return str.substring(1,str.length()-1);
         }
         else if ( n == str.length()-1){
            return str.substring(0,str.length()-2);
         }
         else{
            return str.substring(0,n) +  str.substring(n+1 ,str.length()-1 ) ;
         }
    }


    public String frontBack(String str) {
        if (str.length()==1){
             return str;
        } 
        else if (str==""){
           return "";
        }
        else return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }
    

    public String front3(String str) {
        if (str.length() >=3){
            String newStr  = str.substring(0, 3);
            return newStr + newStr + newStr;
        }
        return str +str +str ;
    }

    public String backAround(String str) {
        char lastOne = str.charAt(str.length()-1);
      return lastOne + str  + lastOne;  
    }
    
    public boolean or35(int n) {
       return n > 0 && (n % 5 == 0  || n % 3 == 0);
    }

    public String front22(String str) {
        if (str == ""){
            return "";
        }
        else if (str.length()==1) return str +str +str ;
       String firstTwoLetters = str.substring(0, 2);
       return firstTwoLetters.concat(str).concat(firstTwoLetters);
    }
    

    public boolean startHi(String str) {
      return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 >100 && temp2 <0) ||(temp1 <0 && temp2 >100);  
    }

    public boolean in1020(int a, int b) {
        return (a>=10 && a<=20) || (b >=10 && b<=20);
    }

    public boolean hasTeen(int a, int b, int c) {
       return  (a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19);
    }
   
    public boolean loneTeen(int a, int b) {
        return  ((a >= 13 && a <=19) && !(b >= 13 && b <=19 )) || ((b >= 13 && b <=19 )&& !(a >= 13 && a <=19) ) ;
    }
    
    public String delDel(String str) {
        if (str.contains("del") && str.indexOf("del")==1){
            String returned = str.replace("del", "");
            return returned;
        }
        return str;
    }

    public boolean mixStart(String str) {
       if(str.indexOf("ix")==1){
         return true;
       }
       else return false;
    }
    
    public String startOz(String str) {
        if (str ==""){
            return "";
        } 
        else if (str.equals("o")){
            return "o";
        }     

        else if (str.equals("z")){
            return "z";
        }
                    
     String start = str.substring(0, 2);
        switch (start){
          case "oz":
            return "oz";
          case "zo":
            return "";
        }


        if ((start.indexOf("z")==0 && start.charAt(1)!='o') ||(start.indexOf("z")==1 && start.charAt(0)!='o') ){
           return "z";
        }
        else if((start.indexOf("o")==0 && start.charAt(1)!='z') ||(start.indexOf("o")==1 && start.charAt(0)!='z')) return "o";
        return "";
    }


    public int intMax(int a, int b, int c) {
        int [] arr = {a,b,c};
        int max = a ;
        for (int ele : arr) {
             if (ele > max) max = ele ;
        }
        return max;
    }

    public int close10(int a, int b) {
      int rangeA = Math.abs(10-a);
      int rangeB = Math.abs(10-b);
      if (rangeA == rangeB){
        return 0;
      }
      else if (rangeA>rangeB){
           return b;
      }
      else return a;
    }
    
    public boolean in3050(int a, int b) {
       boolean ain30and40 = a>=30 && a<=40;
       boolean ain40and50 = a>=40 && a<=50;
       boolean bin30and40 = b>=30 && b<=40;
       boolean bin40and50 = b>=40 && b<=50;
       return (ain30and40 && bin30and40 ) ||(ain40and50 && bin40and50);
    }


    public int max1020(int a, int b) {
       boolean rangeA = a>=10 && a<=20;
       boolean rangeB = b>=10 && b<=20;
       if (rangeA && rangeB && a>b){
            return a;
       }
       else if(rangeA && rangeB && a<b){
           return b;
       }
       else if(rangeA && !rangeB){
          return a; 
       }
       else if(!rangeA && rangeB){
          return b;
       }
       return 0;
    }

    public boolean stringE(String str) {
      int count = 0;
      for (int i = 0 ; i <str.length() ; i++){
        if (str.charAt(i)=='e'){
            count++;
        }
      }
      return count <=3 &&count !=0;
    }
    
    public boolean lastDigit(int a, int b) {
        int lastDigitA = String.valueOf(a).charAt(String.valueOf(a).length()-1);
        int lastDigitB = String.valueOf(b).charAt(String.valueOf(b).length()-1);
        return lastDigitA==lastDigitB;
    }

    public String endUp(String str) {
      if (str.length()<=3){
         return str.toUpperCase();
      }
      String target = str.substring(str.length()-3,str.length());
      String replacement  = target.toUpperCase();
      return str.replace(target, replacement);
    } 
    

    public String everyNth(String str, int n) {
        if (n!=0 || str!=""){
            int i = 0;
            String acc = "";
            while ( i<str.length()){
                if(i%n==0){
                   acc = acc +str.charAt(i);
                }
                i++;
            }
            return acc;
        }
        return "";
    }
    

    public static void main (String[] args){
     System.out.println(new PlayGround().front22("Messi"));
    }

}
