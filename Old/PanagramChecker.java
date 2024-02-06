package Old;
public  class PanagramChecker{

    public static void main(String args[]){
        System.out.println("First Java On WSL 2");
        PanagramChecker x = new PanagramChecker();
       System.out.println(x.check("You shall not pass!"));
        
    }

    public boolean check(String sentence){
         char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         String sentenceLower = sentence.toLowerCase();
         

         for(int i =0 ; i<alphabet.length;i++){
             if(!sentenceLower.contains(Character.toString(alphabet[i]))){
                 return false;
             }
         }

        return true;
    }
}
 
