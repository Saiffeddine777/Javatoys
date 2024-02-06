package Old;
import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I>{

    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }
    
    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }
    
    /**
     * returns the number of pages
     */
    public int pageCount() {
        return this.collection.size()/itemsPerPage;
    }
    
    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        return 0;
    }
    
    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return 0;
    }

 
    public static void main (String[] args){
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.<Character>asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println(helper.itemCount());

    }
}