/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e.commercesystem;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */

public class ECommerceSystem {
static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to the E-Commerce System!" );
        
        ElectronicProduct electronicProduct=new ElectronicProduct("Samsung",1,1,"smartPhone",599.99f);
        ClothingProduct clothingProduct=new ClothingProduct("Medium","Cotton",2,"T-shirt",19.99f);
      BookProduct bookProduct=new BookProduct("O'Reilly","X Publications",3,"OOP",39.99f);
       int id=Integer.parseInt(JOptionPane.showInputDialog("Please Enter your ID"));
     String name=JOptionPane.showInputDialog("please Enter your name");
        String address=JOptionPane.showInputDialog("Please Enter your address");
        
       
        Customer customer=new Customer(id,name,address);
        int nProduct= Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to your cart"));
      
        Cart cart= new Cart(customer.getCustomerId(),nProduct);
         int elec=0;
        int clo=0;
        int book=0;
        for (int i=0;i<nProduct;i++){
            int choise=Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1- "+ electronicProduct.getName()+" 2- "+clothingProduct.getName()+" 3- "+bookProduct.getName() ));
           
           
            if (choise==1)
               {  cart.addProduct(electronicProduct,i);
            elec++;
            }
            else if (choise==2)
             {  cart.addProduct(clothingProduct, i);
            clo++;
            }
            else if (choise==3)
                  {  cart.addProduct(bookProduct, i);
            book++;
            }
            else 
                JOptionPane.showMessageDialog(null, "no product yet");
         
    }
        int agree=Integer.parseInt(JOptionPane.showInputDialog("Your total is $"+ cart.calculatePrice()+". Would you like to place the order? \n 1-yes \n 2-no "));
         
        
        if (agree==1){
           Order order= cart.placeOrder(agree);
            JOptionPane.showMessageDialog(null, "Here's your order's summary");
         
            order.printOrderInfo();
        }
JOptionPane.showMessageDialog(null, "number electronicProduct= "+ elec+" number clothingProduct= "+ clo+" number bookProduct "+ book);
    }
}
