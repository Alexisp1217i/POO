/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author nancy
 */
public class Eva1_11_METODOS_ESTATICOS {

    public static void main(String[] args) {
    //Math es ina clase qie proporciona funciones matematicas
        double valorAleatorio = Math.random();
        int valor = (int) (Math.random() * 100);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        
        //Math math = new Math();
   
      persona perso = new persona();
      perso.mostrarMensaje();
      //USAR FORMULA DE TEMPERATURA
      Temperaturas temp = new Temperaturas();
        //System.out.println(temp.convertirseFaC(100));
        System.out.println(Temperaturas.convertirseFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirFak(100));
        System.out.println(Temperaturas.convertirKaF(100));
        System.out.println(Temperaturas.convertirCaK(100));
    }
}

class persona{
    int valor;
     public void mostrarMensaje(){
         System.out.println("Hola mundo");
     }
}