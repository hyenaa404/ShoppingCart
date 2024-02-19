package model;

/**
 *
 * @author nhs
 */
public class Cart extends MyList<Item> {

    public Cart() {
        super();
    }
    
    
    
    public Item searchById(int id){
        Node<Item> p = head;
        Item item;
        while (p!= null){
            item = p.getData();
            if(item.getId() == id){
                return item;
            }
            p = p.getNext();
        }
        return null;
    }
    
    
    public void adjustQuantity(Item it, int newQuantity){
        it.setQuantity(newQuantity);
    }

    @Override
    public void displayList() {
        System.out.printf("|  %-5s |   %-30s |    %-10s\n\n","ID", "Item", "Quantity");
        super.displayList();
    }
        
}
