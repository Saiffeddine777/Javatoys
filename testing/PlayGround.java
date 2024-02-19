package testing;


public class PlayGround {
    
    public <T> T testigFunction (T var ){
         return var;
    }

    public static void main (String[] args){
       System.out.println(new PlayGround().testigFunction(1));
    }
}