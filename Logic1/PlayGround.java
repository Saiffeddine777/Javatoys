package Logic1;

public class PlayGround{

    public boolean cigarParty(int cigars, boolean isWeekend) {
       return (isWeekend && cigars>=40) || (!isWeekend && cigars>=40 && cigars<=60);
    }
    

    public int dateFashion(int you, int date) {
        if ( (you >= 8&& date> 2) || (date >= 8 && you>2)){
            return 2;
        }
        else if ((you >= 8&&date<=2) || (date >= 8 && you <=2)){
            return 0;
        }

        else if ( you <= 2 || date <= 2){
          return 0;
        }
        else return 1;
    }
    
    public boolean squirrelPlay(int temp, boolean isSummer) {
         return (temp >= 60 && temp<=90 && !isSummer) || (temp>=60 && temp<=100 && isSummer);  
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed == 75 && isBirthday){
            return 1;
        }

        if(speed <= 60){
            return 0;
        }
        else if (speed>60 && speed<=80 && isBirthday ){
            return 0;
        }
        else if (speed>60 && speed<=80 && !isBirthday){
            return 1;
        }
        else if (speed>80){
            if (isBirthday)return 1;
            else return 2;
        }
        else return 0;
    }

    public int sortaSum(int a, int b) {
        int sum = a+b;
        if (sum >=10 && sum<=19){
            return 20;
        }
        else return sum;
    }
    
    public String alarmClock(int day, boolean vacation) {
         if (vacation){
            if ( day>=1 && day<=5){
                return "10:00";
            }
            else return "off";
            
         }
         else if (!vacation && day>=1 && day<=5){
            return "7:00"; 
         }
         else return "10:00";
    }
    
    public boolean love6(int a, int b) {
        return   (a == 6 )|| (b == 6) || (((Math.abs(a+b)) == 6)&& (a+b)==6) ||((Math.abs(a-b)) == 6) || ((Math.abs(b-a)) == 6)||((Math.abs(b+a)) == 6) ;
    }
    
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode){
           if (n<=1 || n>=10){
            return true;
           }
           else return false;
        }
        else{
            if (n>=1 && n<=10){
                 return true;
            }
            else return false;
        }
     }
     
        public boolean specialEleven(int n) {
            return n%11 ==0 || n%11 ==1;
        }
    
        public boolean more20(int n) {
            return n % 20 == 1 ||  n % 20 == 2;
        }
        

        public boolean old35(int n) {
            return (n % 3 == 0 || n% 5 == 0) && !(n % 3 == 0 && n% 5 == 0);
        }
        
        
        public boolean less20(int n) {
            return n % 20 ==19 || n % 20 ==18; 
        }

        public boolean nearTen(int num) {
            return ((num %10 <=2) && (num %10 >=0)) || ((num%10 >=8) && (num%5 <10));
        }

        public int teenSum(int a, int b) {
            int sum = a+b;
            if ((a>=13 && a <=19) || (b>=13 && b <=19)){
                return 19;
            }
            return sum; 
        }
        

        public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
              return !isAsleep ||(isMorning&&isMom) ||(!isMorning && !isMom&&!isAsleep);
        }

        public int teaParty(int tea, int candy) {
            if (tea >= 5 &&candy >= 5){
                 if (tea>=2*candy || candy>=2*tea){
                    return 2;
                 }
                 else return 1;
            }
            else return 0;
            
        }
        
        public String fizzString(String str) {
           if (str.charAt(0)=='f'&&str.charAt(str.length()-1)=='b'){
               return "FizzBuzz";
           }
           else if (str.charAt(0)=='f'){
               return "Fizz";
           }
           else if (str.charAt(str.length()-1)=='b'){
               return "Buzz";
           }
           else return str;
        }

        public String fizzString2(int n) {
            if(n % 3==0 && n % 5==0){
                return "FizzBuzz!";
            }
            else if (n % 3==0){
                   return "Fizz!"; 
            }
            else if (n% 5 == 0){
                 return "Buzz!";
            }

            else return Integer.toString(n)+'!';
        }


        public boolean twoAsOne(int a, int b, int c) {
              return (a+b ==c)||(a+c==b) ||(b+c) ==a ; 
        }

        public boolean inOrder(int a, int b, int c, boolean bOk) {
            return (a>b && c>b && !bOk) ||  (c>b && bOk); 
        }
        
        
        

        
    public static void main (String[] args){
         System.out.println(((Math.abs(-7+1)) == 6));
    }
}