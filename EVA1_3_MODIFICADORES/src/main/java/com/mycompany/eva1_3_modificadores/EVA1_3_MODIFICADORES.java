/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_modificadores;

/**
 *
 * @author nancy
 */
public class EVA1_3_MODIFICADORES {

    public static void main(String[] args) {
    //INSTANCIAR UN OBJETO
    // CLASE IDENTIFICADOR = NEW CONSTRUCTOR(PARAMETROS);
        Persona perso = new Persona();
       perso.setNombre("Jesus Alexis");
        System.out.println("Nombre: " + perso.getNombre());
        
        perso.setApellidos("Jimenes Aldaba");
        System.out.println("Apellido: " + perso.getApellido());
        
        perso.setEdad(18);
        System.out.println("Edad: " + perso.getEdad());
        
        perso.setGenero("H");
        System.out.println("Genero: " + perso.getGenero());
        
        perso.setCurp("JIAJ");
        System.out.println("Curp: " + perso.getCurp());
    }
}
