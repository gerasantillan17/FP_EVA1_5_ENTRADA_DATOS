/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        double precio;
        
        Scanner captu;
        captu = new Scanner (System.in);
        
        marca = captu.nextLine();
       
        System.out.println("Introduce la marca de vehiculo: ");
        marca = captu.nextLine();
        modelo = captu.nextLine();
        System.out.println(modelo);
        System.out.println("Introduce el modelo de vehiculo: ");
        
        year = captu.nextInt();
        System.out.println(year);
        System.out.println("Introduce el year de vehiculo: ");
        
        precio = captu.nextDouble();
        System.out.println(precio);
        System.out.println("Introduce el precio de vehiculo: ");
  }        
}
