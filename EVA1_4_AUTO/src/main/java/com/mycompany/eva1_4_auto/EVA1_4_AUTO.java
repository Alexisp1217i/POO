/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_auto;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA1_4_AUTO {

    public static void main(String[] args) {
        Scanner scani = new Scanner(System.in);
        VEHICULO vehi = new VEHICULO();
    
        vehi.setMarca("Ingresa marca del vehiculo; ");   
        System.out.println("Marca: " + vehi.getMarca());
       
        vehi.setModelo("Mustang");
        System.out.println("Marca: " + vehi.getModelo());
       
        vehi.setYear(2006);
        System.out.println("Marca: " + vehi.getYear());
       
        vehi.setColor("Verde");
        System.out.println("Marca: " + vehi.getColor());
       
        vehi.setPrecio(10000000);
        System.out.println("Marca: " + vehi.getPrecio());
        vehi.imprimirDatos();
    }
    
}
