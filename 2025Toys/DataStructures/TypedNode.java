

/**
 * TypedNode
 */
public class TypedNode <T> {
    
    T data;
    TypedNode <T> next;
    
    public TypedNode (T data ){
        this.data = data;
        this.next = null;
    } 

    public void setNext (T data){
         if (this.next == null){
            this.next = new TypedNode<T>(data);
         }
         else{
            this.next.setNext(data);
         }
    }
    
    public int size (){
         int count = 1;
         if (this.next!=null){
            return count + this.next.size();
         }
         return count;
    }

    public boolean search (T data){
          if (!this.data.equals(data) && this.next!=null){
              return this.next.search(data);
          }
          else{
            return this.data.equals(data);
          }
    }

    public  void insertAtPosition ( T data , T position ){
         if (this.data.equals(position)){
           TypedNode<T> temp = this.next;
           TypedNode<T> inserted  = new TypedNode<T>(data);
           this.next = inserted;
           inserted.next = temp;
         }
         else if (this.next!=null){
            this.next.insertAtPosition(data, position);
         }
    }
    
    public void printElements (){
        System.out.println(this.data);
        if (this.next !=null){
            this.next.printElements();
        }
    }

    public void delete ( T data){
       if (this.data.equals(data) && this.next ==null){
            this.data=null;
       }
       else if (this.next != null) {
        if (this.next.data.equals(data)) {
            this.next = this.next.next;
        } else {
            this.next.delete(data);
        }
    }
          
    }


    public static void main(String [] args){

    }
}