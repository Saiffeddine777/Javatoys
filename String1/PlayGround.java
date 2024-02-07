package String1;


public class PlayGround {
  
    public String helloName(String name) {
        return "Hello " + name +'!';
      }

      public String makeAbba(String a, String b) {
         return a.concat(b).concat(b).concat(a);
      }

      public String makeTags(String tag, String word) {
         String tagOpen = "<"+tag+">";
         String tagClosed = "</"+tag+">";
         return tagOpen.concat(word).concat(tagClosed);  
      }

      public String makeOutWord(String out, String word) {
         String open = out.substring(0, out.length()/2);
         String close = out.substring(out.length()/2, out.length());
         return open.concat(word).concat(close); 
      }

      public String extraEnd(String str) {
        String toExtend = str.substring(str.length()-2, str.length());
        return toExtend+toExtend+toExtend;
      }
      
      public String firstTwo(String str) {
         if (str.length()<2){
            return str;
         }
          return str.substring(0,2);
      }
      
      public String firstHalf(String str) {
          return str.substring(0,str.length()/2);
      }

      public String withoutEnd(String str) {
         String acc = "";
          for(int i =1 ; i<str.length()-1;i++){
             acc = acc + str.charAt(i);
          }

          return acc;
      }
      
      public String comboString(String a, String b) {
         String s = "";
         String l = "";
         if (a.length()>b.length()){
             s= b;
             l = a;
         }
         else if (b.length()>a.length()){
            s =a;
            l =b;
         }

         return s + l + s;
      }

      public String nonStart(String a, String b) {
           return a.substring(1,a.length()) + b.substring(1, b.length()); 
      }
      
      public String left2(String str) {
         if (str.length()<=2){
            return str;
         } 

         return str.substring(2,str.length()) + str.substring(0, 2);
      }

      public String right2(String str) {
         if (str.length()<=2){
            return str;
         } 
         return str.substring(str.length()-2, str.length())+str.substring(0, str.length()-2);
      }

      public String theEnd(String str, boolean front) {
          if(str.length()!=0 && front){
            return str.charAt(0)+"";
         }
         else if ( str.length()!=0 &&!front){
            return str.charAt(str.length()-1)+"";
         }
          return "";
      }
      
      public String withouEnd2(String str) {
         if (str.length()<=2) return "";
          return str.substring(1, str.length()-1);
      }
      
      public String middleTwo(String str) {
        return str.substring((str.length()/2)-1,(str.length()/2)+1);
      }

      public boolean endsLy(String str) {
             return str.endsWith("ly");
      }

      public String nTwice(String str, int n) {
         return str.substring(0,n).concat(str.substring(str.length()-n, str.length()));
      }

      public String twoChar(String str, int index) {
         if (index<str.length()-1 && index>0) return str.substring(index, index+2);
          return str.substring(0,2);
      }
      
      public String middleThree(String str) {
          return str.substring((str.length()/2)-1, (str.length()/2)+2);
      }

      public boolean hasBad(String str) {
          return str.indexOf("bad") ==0 ||str.indexOf("bad") ==1; 
      }

      public String atFirst(String str) {
        switch (str.length()) {
        case 0:
            return "@@";
        case 1:
           return str+"@";
        case 2:
           return str; 
         default:
            break;
        }  
       return str.substring(0, 2); 
      }

      public String lastChars(String a, String b) {
         if (a.length()==0&&b.length()==0){
            return "@@";
         }
         else if (a.length()==0&&b.length()!=0){
           return "@"+b.substring(b.length()-1, b.length());
         }
         else if(a.length()!=0&&b.length()==0){
            return a.substring(0, 1)+"@";
         }
        return    a.substring(0, 1) + b.substring(b.length()-1, b.length());
       }
      
    
       public String conCat(String a, String b) {
         String withoutC = "";
         if((a.length()==0) || (b.length()==0) ){
            return a.concat(b);
         }
         if (a.charAt(a.length()-1)==b.charAt(0)){
             return a.substring(0, a.length()-1).concat(b);
         }
         else if (a.charAt(a.length()-1)=='c'){
            withoutC = a.substring(0, a.length()-1);
         }
         else{
            withoutC =a;
         }
         return withoutC.concat(b);
       }

       public String lastTwo(String str) {
          switch (str.length()) {
            case 0:
               return "";
            case 1:
               return str;
            case 2: 
               return str.substring(1, 2)+ str.substring(0, 1);
            default:
               return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
          }
       }

       public String seeColor(String str) {
         if (str.startsWith("blue")){
            return "blue";
         }
         else if (str.startsWith("red")){
            return "red";
         }

         return "";
       }
       
       public boolean frontAgain(String str) {
          if (str.length()<2) return false;
           return str.substring(0,2).equals(str.substring(str.length()-2, str.length()));
       }
       
       public String minCat(String a, String b) {
           if (a.length() == b.length()) return a.concat(b);
           
           else if (a.length() > b.length()){
             return  a.substring(a.length()-b.length(), a.length()).concat(b);  
           }
           else{
            return a.concat(b.substring(b.length()-a.length(),b.length()));
           }
       }

       public String extraFront(String str) {
          switch (str.length()) {
            case 0:
               return "";
            case 1 : 
               return str +str +str;
            case 2 : 
               return str +str +str;
          
            default:
               String triplet = str.substring(0, 2); 
               return triplet + triplet + triplet;
          }
       }

      public String without2(String str) {
         if (str == "" || str.length() ==1) return str;
         if (str.substring(0, 2).equals(str.substring(str.length()-2,str.length()))){
            return str.substring(2, str.length());
         }
         return str; 
      }
         
      public String deFront(String str) {

         if (str.charAt(0)=='a' && str.charAt(1)=='b'){
            return "a"  +"b"+  str.substring(2,str.length());
         }
         else if (str.charAt(0)=='a' && str.charAt(1)!='b'){
            return "a" + str.substring(2,str.length());
         }
         else if (str.charAt(0)!='a' && str.charAt(1)=='b'){
            return "b" + str.substring(2,str.length());
         }
         return str.substring(2,str.length());
      }
      
      public String startWord(String str, String word) {
         if (str.startsWith(word)){
            return word;
         }
         else if ((str.substring(0,str.length()/2).contains(word))||(str.substring(0,str.length()/2).contains(word) && (word.charAt(0)!=str.charAt(0)))){
             return str.substring(0, word.length());
             
         }
         return "";
      }

      public String withoutX(String str) {
         if (str =="" || str =="x" || str=="xx") return "";
         if (str.charAt(0)!='x'&& str.charAt(str.length()-1)!='x') return str;
         if(str.charAt(0)=='x'&& str.charAt(str.length()-1)=='x'){
               return str.substring(1, str.length()-1);
         }
         else if (str.charAt(0)=='x'&& str.charAt(str.length()-1)!='x'){
               return str.substring(1, str.length());
         }
         else{
            return str.substring(0, str.length()-1);
         }
      }


      public String withoutX2(String str) {
            String acc ="";
             for (int i =0 ; i<str.length() ; i++){
                 if ((i ==0 || i ==1)&& str.charAt(i) =='x' ){
                     continue;
                 }
                 acc= acc+ str.charAt(i);
             }
             return acc;
      }

 
 

    public static void main (String[] args){
       System.out.println(new PlayGround().withoutX("Hxix"));
    }


}