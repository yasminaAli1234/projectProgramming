/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author DELL
 */
public class ClothingProduct extends Products {
    private String size;
    private String fabric;

    public ClothingProduct() {
    }

    public ClothingProduct(String size, String fabric, int productId, String name, float price) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }
    
    
    
    
    
}
