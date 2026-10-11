public class PlayGround{
    
    // public boolean makeBricks(int small, int big, int goal) {
    //     return (goal>(big*5) && (goal%(big*5)<=small)) 
    //       || (((big*5)>=goal) &&  (goal -))
    //     ; 
    // }
        public  int [][] multiplicationTable(int n){

            if (n==0){
                return null;
            }

            else {
                int count = 1;
                int nextIndexCount = 2;
                int step = 1;
                int [][] result = new int [n] [n]; 
                for (int i = 0 ; i <result.length ; i++) {
                       int[] arrayToInsert = new int [n];
                       for(int j = 0 ; j <arrayToInsert.length ;j++){
                           arrayToInsert[j] = count;
                           count = count +step;
                       }
                       result[i] = arrayToInsert;
                       count = nextIndexCount;
                       nextIndexCount++;
                       step++;
                }

                return result;
                
            }
        }

    
      

    public boolean endOther(String a, String b) {
          String aLower = a.toLowerCase();
          String bLower = b.toLowerCase();

          if (aLower.equals(bLower)) {
            return true;
          }
          else if (aLower.length() > bLower.length()){
            return aLower.endsWith(bLower);
          } 
          else{
            return bLower.endsWith(aLower);
          }
                  
    }

    // public int loneSum(int a, int b, int c) {
    //     int[] arrayA = new int[]{};
        

    //     return 0;
    // }
    
    public boolean inOrder(int a, int b, int c, boolean bOk) {
           
         return  (a<b && c>b) || (bOk && c>b)  ; 
    
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
         return (b>a && c>b ) || (equalOk && b>=a && c>=b );
    }
    
    public int[] maxEnd3(int[] nums) {
         
         int [] acc = new int[nums.length];
         if (nums[0] >= nums[nums.length-1]){
            for (int i = 0; i < acc.length; i++) {
                acc[i] = nums[0];
            }
         } 
         else {
            for (int i = 0; i < acc.length; i++) {
                acc[i] = nums[nums.length-1]; 
            }
         }
         return acc;
    }

    public boolean double23(int[] nums) {
       
       return  nums.length==2 && (nums[0] == nums[1]) &&((nums[0] == 2) ||(nums[0] == 3)) ;
    }



    
    public static void main(String[] args){
        // System.out.println(new PlayGround().makeBricks(3, 2, 9));
        System.out.println(new PlayGround());
    }
}

