  import java.util.ArrayList;
public class PrimeDecomp{
   /*
     Given a positive number n > 1 find the prime factor decomposition of n. 
     The result will be a string with the following form :

     "(p1**n1)(p2**n2)...(pk**nk)"
     with the p(i) in increasing order and n(i) empty if n(i) is 1.

     Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
   */
     static class PrimeRepetition{
         int prim;
         int repet;
        public PrimeRepetition(int prime){
             prim = prime;
             repet= 0;
        }
        public int getPrime(){
             return this.prim;
        }
        public void setRepetition(){
             this.repet++;
        }
        public int getRepetition(){
             return this.repet;
        } 
    }
 

    public static String factors(int n) {
      ArrayList<PrimeRepetition> MultipleFactors = new ArrayList<>();
      int prime = 2;

      while (n != 1) {
          PrimeRepetition PrimeRepeat = new PrimeRepetition(prime);
          while (n % prime == 0) {
              n = n / prime;
              PrimeRepeat.setRepetition();
          }

          if (PrimeRepeat.getRepetition() > 0) {
              MultipleFactors.add(PrimeRepeat);
          }
          prime++;
      }

      String str = "";
      for (PrimeRepetition Obj : MultipleFactors) {
          String subStr = "";
          if (Obj.getRepetition() == 1) {
              subStr = "(" + Obj.getPrime() + ")";
          } else {
              subStr = "(" + Obj.getPrime() + "**" + Obj.getRepetition() + ")";
          }
          str += subStr;
      }

      return str;
  }

    public static void main(String[] Args){
      
     System.out.println(factors(7775460));

    }
}