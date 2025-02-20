/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author nancy
 */
public class Temperaturas {
   
     public static double convertirseFaC(double fa){
         double resu;
         resu = (fa - 32) * (5.0/9.0);
         return resu;
     }
     
     public static double convertirCaF(double ce){
        double resu;
         resu = (ce * (9.0/5.0)) + 32;
      return resu;
     }
     
     public static double convertirFak(double Ke){
         double resu;
         resu = (5.0/9.0) * (Ke-32) + 273.15;
         return resu;
     }
     
     public static double convertirKaF(double Fa){
         double resu;
         resu = 1.8 * (Fa - 273.15) + 32;
         return resu;
     }
     
     public static double convertirCaK(double Ke){
         double resu;
         resu = Ke + 273.15;
         return resu;
     }
     
     public static double convertirKaC(double Ce){
         double resu;
         resu = Ce -273.15;
         return resu;
     }
}
