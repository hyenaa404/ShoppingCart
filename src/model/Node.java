
package model;

/**
 *
 * @author nhs
 * @param <T>
 */
public class Node<T> {
    private T data;
    private Node pre;
    private Node next;

    public Node(T data, Node pre, Node next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
    
    
}
