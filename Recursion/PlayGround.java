package Recursion;

public class PlayGround {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        String strN = String.valueOf(n);
        if (strN.charAt(0) == '8') {
            if (strN.length() > 1) {
                return 1 + count8(Integer.parseInt(strN.substring(1)));
            } else {
                return 1;
            }
        } else {
            if (strN.length() > 1) {
                return count8(Integer.parseInt(strN.substring(1)));
            } else {
                return 0;
            }
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
    
    

    public static void main(String[] args) {
       System.out.println(new PlayGround().count8(88788) );
    } 
}