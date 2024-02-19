
package controller;

import model.Cart;
import model.Item;
import util.InputUtils;

/**
 *
 * @author nhsuong
 */
public class Controller {
    
    public static void main(String[] args) {
        Cart cart = new Cart();
        int choice;
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    addItem(cart);
                }
                case 2 -> {
                    removeItem(cart);
                }
                case 3 -> {
                    adjustQuantity(cart);
                }
                case 4 -> {
                    clearCart(cart);
                }

                case 5 ->
                    System.exit(0);
            }
        }
    }
    
    public static Item inputItem(Cart cart){
        System.out.println("Enter item: ");
        String name = InputUtils.inputName();
        System.out.println("Enter quantity: ");
        int quantity = InputUtils.inputInt();
        int id;
        if (cart.isEmpty()){
            id = 1;
        }else{
            id = cart.getTail().getData().getId() + 1;
        }
        Item it = new Item(id, name, quantity);
        return it;
    }
    
    public static void adjustQuantity(Cart cart){
        cart.displayList();
        System.out.println("Enter id to adjust quantity: ");
        int id = InputUtils.inputInt();
        Item it = cart.searchById(id);
        if( it != null){
            System.out.println("Enter new quantity: ");
            int newQuantity = InputUtils.inputInt();
            cart.adjustQuantity(it, newQuantity);
            System.out.println("Adjusted successfully!");
            cart.displayList();
        }else{
            System.err.println("ID not found!");
        }
    }
    
    public static void removeItem(Cart cart){
        cart.displayList();
        System.out.println("Enter id to remove item: ");
        int id = InputUtils.inputInt();
        Item it = cart.searchById(id);
        if( it!= null){
            cart.removeList(it);
            System.out.println("Removed successfully!");
            cart.displayList();
        }else{
            System.err.println("ID not found!");
        }
    }
    
    public static void addItem(Cart cart){
        cart.add(inputItem(cart));
        System.out.println("Added successfully!");
        cart.displayList();
    }
    
    public static void clearCart(Cart cart){
        cart.displayList();
        System.out.println("Do you sure to clear cart? Data will lost forever.\nPress 1 (YES) or 0 (NO)");
        int choice = InputUtils.inputOption(0, 1);
        if (choice == 1){
            cart.clear();
            System.out.println("Cleared cart!");
        }
    }
    
}
