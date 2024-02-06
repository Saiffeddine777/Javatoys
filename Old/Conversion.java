package Old;
public class Conversion{
/*
Create a function taking a positive integer between 1 and 3999 (both included) 
as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting 
with the left most digit and skipping any digit with a value of zero. In Roman
 numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 
 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

conversion.solution(1000); //should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
*/
    public String solution(int n){
        //applying a recusive call on the modulo 
        if (n<10){
            switch(n){
                case 1:
                return "I";
                case 2:
                return "II";
                case 3:
                return "III";
                case 4:
                return "IV";
                case 5:
                return "V";
                case 6:
                return "VI";
                case 7:
                return "VII";
                case 8:
                return "VIII";
                case 9:
                return "IX";
            }   
        }
        else if(n<=99 && n>=10){
              int mod = n%10;
              int res = n/10;
              switch(res){
                case 1:
                return "X" +solution(mod);
                case 2:
                return "XX" +solution(mod);
                case 3:
                return "XXX" +solution(mod);
                case 4:
                return "XL" +solution(mod);
                case 5:
                return "L"+solution(mod);
                case 6:
                return "LX" +solution(mod);
                case 7:
                return "LXX"+solution(mod);
                case 8:
                return "LXXX"+solution(mod);
                case 9:
                return "XC"+solution(mod);
            }  
        }
        else if(n<=999&&n>=100){
                int mod = n%100;
                int res = n/100;
              switch(res){
                case 1:
                return "C" +solution(mod);
                case 2:
                return "CC" +solution(mod);
                case 3:
                return "CCC" +solution(mod) ;
                case 4:
                return "CD"  +solution(mod);
                case 5:
                return "D" +solution(mod);
                case 6:
                return "DC" +solution(mod);
                case 7:
                return "DCC" +solution(mod);
                case 8:
                return "DCCC" +solution(mod);
                case 9:
                return "CM" +solution(mod);
            } 
        }
        else if(n<=3999&&n>=1000){
           int mod = n%1000;
           int res = n/1000;
              switch(res){
                case 1:
                return "M" +solution(mod);
                case 2:
                return "MM" +solution(mod);
                case 3:
                return "MMM" +solution(mod);
            } 
        }

        return "";
    }

    public static void main (String[] args){
       Conversion  Obj  = new Conversion();
       System.out.println(Obj.solution(1820)); 

    }
}