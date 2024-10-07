package Logic2;
public class PlayGround{
    
    // public boolean makeBricks(int small, int big, int goal) {
    //     return (goal>(big*5) && (goal%(big*5)<=small)) 
    //       || (((big*5)>=goal) &&  (goal -))
    //     ; 
    // }

    public class Multiplication{
        public int [][] multiplicationTable(int n){

            if (n==0){
                return null;
            }

            else {
               int [][] result =  new int [n][n];
               int count = 1;
                for (int i =0 ; i<result.length; i++){
                   
                    for (int j = 0 ;j<result[i].length ;j++){
                        result[i][j] = count ;
                        count++;
                        
                    }
                }
                return result;
                
 
            }
        }
      }



    
    public static void main(String[] args){
        // System.out.println(new PlayGround().makeBricks(3, 2, 9));
        System.out.println(new PlayGround().new Multiplication().multiplicationTable(3));
    }
}

