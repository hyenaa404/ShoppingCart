
package model;

/**
 *
 * @author nhs
 */
public class Item {
    private String name;
    private int quantity;
    private int id;

    public Item() {
    }

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        System.out.printf("|  %-5d |   %-30s |    %-10d\n",this.id, this.name, this.quantity);
        return "";
    }
    
    
    
}
