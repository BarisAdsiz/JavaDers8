/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_8;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Çemberin Çevresi 2 * 3.14 * r
        
        Scanner input1 = new Scanner(System.in);
        double pi = 3.14, r;
        System.out.print("Enter Radius: ");
        r = input1.nextDouble();
        
        double hesapla = 2 * 3.14 * r;
        System.out.println("Circumference of the circle: " + hesapla);
        
    }
    
}
