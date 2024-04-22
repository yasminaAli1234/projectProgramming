/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author DELL
 */
public class ElectronicProduct extends Products {
    private String brand;
    private int warrantlyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantlyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantlyPeriod =Math.abs(warrantlyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantlyPeriod(int warrantlyPeriod) {
        this.warrantlyPeriod =Math.abs(warrantlyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantlyPeriod() {
        return warrantlyPeriod;
    }
    
    
    
    
}
