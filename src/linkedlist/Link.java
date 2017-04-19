package linkedlist;

/**
 *A class that represents a single link object
 * 
 * @author Administrator Gabe
 */
public class Link {

    public double data; // can replace this with any kind of object
    public Link next;

    public Link(double data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return "" + data;
    }
}
