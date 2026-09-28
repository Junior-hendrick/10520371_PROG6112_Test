/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author Student
 */
public class Question1 {

    public static void main(String[] args) {
         // Single array for electronics
         //Single array for City
        String[] city = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] electronics = {"PS5","XBOX","SWITCH"};
        //Intetialize difference to zero
             int difference=0;
        // Two-dimensional array for electronics
        // Column 0 = PS5
        // Column 1 = XBOX
        // Column 2 = SWITCH
        int[][] price = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        int highestDifference = 0;
        String highestManufacturer = "";
          // Display Gaming Console
        System.out.println("--------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        // Display Electronics
        for (int r=0; r < electronics.length;r++){//Outer for loop Start r
             System.out.print("\t\t"+electronics[r]);
         }//Inner for Loop End r
         System.out.println();
        //System.out.println("--------------------------------------------------------------");
        // Align and display Citys with their prices
        for (int i = 0; i < city.length; i++)
        {
            //Calculate the amount for each city 
            difference = price[i][0] + price[i][1] + price[i][2] ;

            System.out.print(city[i] + "\t\t");
            System.out.print(" " + price[i][0] + "\t\t");
            System.out.print(" " + price[i][1] + "\t\t");
            System.out.print(" " + price[i][2] + "\t\t");
            

           

            System.out.println();
           // Identify the highest differance in each city
            if (difference > highestDifference)
            {
                highestDifference = difference;
                highestManufacturer = city[i];
            }
        }
        // Display Console sales total for each city
            System.out.println("--------------------------------------------------------------");
            System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
            System.out.println("--------------------------------------------------------------");
            System.out.println();
            // Calculate and display each accumalation per city
        for (int t = 0; t < electronics.length; t++)
        {
           difference = price[t][0] + price[t][1] + price[t][2]; 
           System.out.print(city[t] + "\t\t");
           System.out.println(" " + difference + "\t\t");
        }
        // Display the highest differance in city 
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES : " + highestManufacturer);
        System.out.println("--------------------------------------------------------------");
 
    }
}
