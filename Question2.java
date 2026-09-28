/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Question2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in );     
       //User Console Type
       System.out.print("Enter Console Type: ");
       String consoleType = input.nextLine();
      //User Store name 
       System.out.print("Enter Store Name: ");
       String store = input.nextLine();
       //User Total Sales
       System.out.print("Enter Total Sales: ");
       int totalSales = input.nextInt();
       
       ConsoleSales sales = new ConsoleSales(consoleType,store,totalSales);
       sales.displayInfo();
       input.close();
    }
}
