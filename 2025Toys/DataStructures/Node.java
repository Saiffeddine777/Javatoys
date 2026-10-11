


public class Node {
    int val;
    Node next;

    public Node (int val ){
         this.val = val;
         this.next = null;
    }

   
    public void setNext (int val){
        if (this.next == null){
            this.next = new Node(val);
        }
        else{
            this.next.setNext(val);
        }         
    }


    public int getSize(){
        int count = 1 ;

        if (this.next!=null){
            return 1 + this.next.getSize();
        }
        else return count ;
    }


    public boolean search(int val){
          if (this.val != val && this.next != null ){
              return this.next.search(val);
          }

          else return this.val==val;
    }

    public static Node insertAtPosition (Node linkedList , int value , int position ){
          if (linkedList.val == position ){
            Node temp = linkedList.next;
            linkedList.setNext(value);
            linkedList.next.next = temp;
            return linkedList;
          }
          
          else if (linkedList.next != null){
             return insertAtPosition(linkedList.next, value, position);
          }
          return linkedList;
    }

    public void getLinkedListValues(){
        System.out.println(this.val);

        if (this.next!=null){
            this.next.getLinkedListValues();
        }
    }
   
    public static Node delete( Node list ,int val){
         if (list==null) return null;
         if (list.val == val ){
             return list.next;
         }

         list.next = Node.delete(list.next, val);
         return list;
    }
    
    
}