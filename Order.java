/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Order {
    private int customerId;
    private int orderId;
    Products[]products;
    private float totalPrice;

    public Order(int orderId) {
        this.orderId=Math.abs(orderId);
    }

    public Order(int customerId, int orderId, Products[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }
    public void printOrderInfo(){
        JOptionPane.showMessageDialog(null, "Order ID:"+ orderId+"\nCustomer ID:"+ customerId);
        JOptionPane.showMessageDialog(null, "Products:");
        
        for (Products product : products) {
            if (product != null) {
                JOptionPane.showMessageDialog(null, product.getName() + " - $" + product.getPrice());
            }
        }
       JOptionPane.showMessageDialog(null, "Total Price: $" + totalPrice);
   
    
    
    
    
    }
    
    
    

}
