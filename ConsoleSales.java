/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }
    // Print/Display Information
    public void displayInfo() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("*******************************");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
 
}
