package Array1;


public class PlayGround{
    public boolean firstLast6(int[] nums) {
       if (nums[0]==6 || nums[nums.length-1]==6){
         return true ;
       }
       return false;
    }

    public boolean sameFirstLast(int[] nums) {  
      if (nums.length!=0)  return nums[0] == nums[nums.length-1]; 
      return false;
    }

    public int[] makePi() {
       return new int[]{3,1,4};
    }
    
    public boolean commonEnd(int[] a, int[] b) {
        if (a.length !=0  && b.length !=0) return a[0] ==b [0] || a[a.length-1] == b[b.length-1];
        return false;
    }

    public int sum3(int[] nums) {
        int acc = 0; 
        for (int i =0 ; i<nums.length ; i++){
            acc = acc + nums[i];
        }
        
        return acc;
    }
   


    public int[] rotateLeft3(int[] nums) {

        if (nums.length ==3) return new int[]{nums[1] ,nums[2], nums[0]};
      
        return new int[]{};
        
    }
    

    public int[] reverse3(int[] nums) {
        return new int [] {nums[2],nums[1],nums[0]};
    }
    
    public int[] maxEnd3(int[] nums) {
       int max =  Math.max(nums[0],nums[1]);
       int secondMax = Math.max(max , nums[2]);
       return new int[] {secondMax, secondMax,secondMax};
    }

    public int sum2(int[] nums) {
       if (nums.length ==0){
        return 0;
      }
       else if (nums.length ==1 ){
        return nums[0];
       }

       return nums[0] + nums[1]; 
    }
    
    public int[] middleWay(int[] a, int[] b) {
      return new int [] {a[1],b[1]};
    }

    public int[] makeEnds(int[] nums) {
        if (nums.length ==1) return  new int []{nums[0],nums[0]};
        if (nums.length > 1) return new int[]{nums[0], nums[nums.length-1]};
        return nums;
    }

    public boolean has23(int[] nums) {
       return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3; 
    } 
    
    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public int[] makeLast(int[] nums) {
        int[] returnedArray = new int[nums.length*2];
        int i =0;
        while (i <returnedArray.length-1){
            returnedArray[i] = 0;
            i++;
        }
       returnedArray[returnedArray.length-1] = nums[nums.length-1];
       return returnedArray;
    }

    public boolean double23(int[] nums) {
        if(nums.length>1 ) {
            if (nums[0]==nums[1]){
               return true;
            }
        }
       return false;
    }


    public int[] fix23(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
         if (nums[i] ==2 && nums[i+1]==3) {
            nums[i+1] = 0;
         }
         
       }
       return nums;
    }

    public int start1(int[] a, int[] b) {
        int count  = 0;
         if  (a.length > 0&& a[0] == 1){
            count++;
         }
         if ( b.length > 0&&b[0] == 1){
            count++;
         }
         

        return count ;
    }
    
    
    public int[] biggerTwo(int[] a, int[] b) {
       if (a[0] + a[1] >= b[0] +b[1] ){
          return a;
       }
       else return b;
    }
    
    public int[] makeMiddle(int[] nums) {
      return new int[] {nums[nums.length/2-1] , nums[nums.length/2]};
    }

    public int[] plusTwo(int[] a, int[] b) {
       return new int[] {a[0],a[1],b[0],b[1]};
    }
    
    public int[] swapEnds(int[] nums) {
      int[] acc = new int[nums.length] ; 
       acc[0] = nums[nums.length-1];
        int i = 1;
       while (i<acc.length-1){
          acc[i] = nums[i];
          i++;
       }
       acc[acc.length-1] = nums[0];
       return acc;
    }

    public int[] midThree(int[] nums) {
       return new int[] {nums[nums.length/2-1] , nums[nums.length/2],nums[nums.length/2+1]};
    }
    
    public int maxTriple(int[] nums) {
      int max = nums[0];
      int iterator = 1;
      while (iterator<nums.length){
         if (max <nums[iterator] && (iterator == nums.length-1 || iterator == nums.length/2)){
            max = nums[iterator];
         } 
         iterator++;
      }
      return max;
   }


      public int[] frontPiece(int[] nums) {
           if (nums.length <2) return nums;
           return new int[]{nums[0],nums[1]};
      }

      public boolean unlucky1(int[] nums){
         if ( nums.length<2){
            return false;
         }
         for (int i = 0 ; i<nums.length ;i++ ){
             if ((i == 0 ||i == 1 || i == nums.length-2)&&nums[i]==1 && nums[i+1]==3){
                  return true;
             }
         }
         return false;
       }

       public int[] make2(int[] a, int[] b) {
           if (a.length == 0&&b.length <=2){
              return b;
           }
           else if (b.length == 0&&a.length <=2){
             return a;
           }
           else if(a.length>=2){
              return new int[]{a[0],a[1]};
           }
           else return  new int[]{b[0],b[1]};
            
       }
       

   
    
    public static void main (String[] args){
       new PlayGround().maxEnd3(new int[]{2, 11, 30});
    }
}