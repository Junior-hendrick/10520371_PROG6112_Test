/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsole {
    //Declaring as private
    private String consoleType;
    private String store;
    private int totalSales;

  
    public Consoles(String consoleType, String store, int totalSales){
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
        
    }
    //Overide
    @Override
    //Getter
      public String getConsoleType() {
        return consoleType;
    }
      //Overide
    @Override
    //Getter
    public String getStore() {
        return store;
    }
    //Override
    @Override
    //Getter
    public int getTotalSales() {
        return totalSales;
    }
}
