/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author DELL
 */
public class Cart {
    private int customerId;
    private int nProduct;
    Products[]products;
    public Cart(){}
    public Cart(int customerId,int nProduct){
    this.customerId=Math.abs(customerId);
    this.nProduct=nProduct;
    this.products=new Products[nProduct];
 
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setnProduct(int nProduct) {
        this.nProduct = nProduct;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getnProduct() {
        return nProduct;
    }

    public Products[] getProducts() {
        return products;
    }
    public float calculatePrice(){
    float price=0;
    for(Products product: products){
          if (product != null) {
            price += product.getPrice();
        }
    
    }
    return price;
    }
  public void addProduct(Products product, int id){
      if (id>=0&& id <nProduct)
          products[id]=product;
      else 
          System.out.println("invaild");
          
     }
     public void remoneProduct(int id){
     if (id>=0&& id <nProduct)
         products[id]=null;
     else 
     System.out.println(" invaild ID");
     
     
     }
   public Order placeOrder(int orderId) {
    return new Order(Math.abs(customerId),orderId,products, calculatePrice());
     
    }
    
    
    
    
    
    }

    
    
    
    
    
    

