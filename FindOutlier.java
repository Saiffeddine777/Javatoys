public class FindOutlier{
 /*
  You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
  The array is either entirely comprised of odd integers or entirely comprised of even integers except 
  for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */

    public static void main(String args[]){
        
        System.out.println(FindOutlier.find(new int[] {2, 6, 8, 10, -3}));

    }

    static int find(int[] integers){
        if(integers.length<3){
            return 0;
        }

        int countOdd =0;
        int countEven=0;
        for(int i = 0 ;i<integers.length ; i++){
            if (integers[i]%2==1 || integers[i]%2== -1 ){
                countOdd ++;
            }
            else if(integers[i]%2==0){
                countEven++;
            }
        }
        if(countOdd>countEven){
            for(int i:integers){
                if(i%2==0){
                  return i;
                }    
            }
        }
        else if (countEven>countOdd){
           for(int i :integers){
            if(i%2==1 ||i%2==-1){
                return i;
            }
           }
        }

        return 0;
    }
}