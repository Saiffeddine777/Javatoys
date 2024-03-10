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
  

    
    
    public static void main (String[] args){
          System.out.println(new PlayGround().dateFashion(10, 2));
    }
}