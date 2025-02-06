/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1_clases_objetos;

/**
 *
 * @author nancy
 */
public class EVA1_1_CLASES_OBJETOS {

    public static void main(String[] args) {
       //CREAR UNA OBJETO
       //INSTANCIAR
       //Identidicador para guardar la direccion en memoria 
       //variable de un tipo de dato abstracto
       Persona persona1;//declaramos una variable de tipo persona
       //asignamos memoria
       persona1 = new Persona();//creamos un objeto de tipo persona
       persona1.edad = 10;
       persona1.genero = "H";
       persona1.nombre = "Jesus Jimenez";
       persona1.imprimirDatos();
       System.out.println(persona1);
       
        //JAVA:
       //no accede ls a direccion es reales de memoria  (RAM)
      // A las direcciones (falsas)
     //   
    }
}

class Persona{
    //DATOS - ESTADO - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO
    void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + edad);
    }
}
