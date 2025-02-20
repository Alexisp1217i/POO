/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_13_sobrecarga_metodos;

/**
 *
 * @author nancy
 */
public class Eva_13_Sobrecarga_Metodos {

    public static void main(String[] args) {
        System.out.println("Hello World");   
        System.out.println(100);   
        System.out.println(100.1);   
        System.out.println(3 > 5);   
        System.out.println('c');   
        System.out.println(new Eva_13_Sobrecarga_Metodos());   
        System.out.println(sumar(2,3));   
        System.out.println(sumar("Hello","World"));
        sumar();
    }
    
    //---------HEADER (Cabecera)---------------//
    //                |----FIRMA---------------|
    public static int sumar(int val1, int val2){
        //IMPLEMENTAICON
        return val1 + val2;
    }
  
    public static String sumar(String val1, String val2){
        //IMPLEMENTAICON
        return val1 + val2;
    }
    
    public static void sumar(){
        
    }
    
 
}
