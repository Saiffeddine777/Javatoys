package String2;

public class PlayGround{
    public String doubleChar(String str){
        String acc = "";
        
        for (int i = 0 ; i <str.length() ; i++){
            acc = acc + str.charAt(i) +str.charAt(i);
        }
        
        return acc;
    }

    public int countHi(String str) {
        int count = 0;
        if (str.length() <2){
            return 0;
        }
       for (int i = 0 ; i<str.length()-1 ; i++){
            if ("hi".equals(str.substring(i,i+2))){
                count++;
            }
       }
       return count;
    }

    public boolean catDog(String str) {
       int dogCount = 0 ;
       int catCount = 0 ;
       for (int i = 0 ; i<str.length()-2 ; i++){
           if (str.substring(i,i+3).equals(("dog"))){
              dogCount++;
           }
           else if (str.substring(i,i+3).equals(("cat"))){
            catCount++;
         }
       }
        return dogCount == catCount;
    }

    public int countCode(String str) {
        int count = 0 ;
        for(int i = 0 ; i<str.length()-4; i++){
            String subs = str.substring(i, i+4);
            if(subs.charAt(0)=='c' && subs.charAt(1)=='o'&& subs.charAt(3)=='e'){
                count++;
            }
        }
        return count;
    }
    
    public boolean endOther(String a, String b) {
        if (a.length()>b.length()){
            return a.substring(a.length()-b.length(),a.length()-1).toLowerCase()==b.toLowerCase() ;
        } else if ( b.length()>a.length()){
            return  b.substring(b.length()-a.length(),b.length()-1).toLowerCase()==a.toLowerCase();
        }
        return b.length()==a.length();
    }
    

    public static void main(String[] args){
         String Pl = new PlayGround().doubleChar("Messi");
         System.out.println(Pl);
    }
}