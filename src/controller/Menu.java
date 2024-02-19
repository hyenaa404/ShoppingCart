/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("1. Add item to cart.");
        System.out.println("2. Remove item from cart.");
        System.out.println("3. Adjust quantity of an item.");
        System.out.println("4. Clear cart.");
        System.out.println("5. Exit.");
        int option = InputUtils.inputOption(1, 5);
        return option;
    }
}
