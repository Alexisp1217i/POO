/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_apa;
import Fichas_APA.Libro;
import Fichas_APA.SitioWeb;
/**
 *
 * @author Alexis
 */
public class Eva1_6_APA {

    public static void main(String[] args) {
        Libro book = new Libro();
        SitioWeb web = new SitioWeb();
     //LIBRO
book.imprimirReferencia();
        book.setAutor("Stephen_Kings");
        System.out.print(" " + book.getAutor());
       
        book.setTitulo("IT");
        System.out.print(" " + book.getTitulo());
      
        book.setYear(1986);
        System.out.print("" + book.getYear());
        
         book.setCiudad("New York");
         System.out.print(" " + book.getCiudad());
         
         book.setEditorial("Viking");
         System.out.print(" " + book.getEditorial());
        
         
     //Sitio_Web
 web.imprimirReferencia();
       web.setAutor("Wikipedia");
        System.out.println(" " + web.getAutor());
        
        web.setNameWeb("Wikipedia");
        System.out.println(" " + web.getNameWeb());
        
        web.setYear(2024);
         System.out.println(" " + web.getYear());
         
        web.setMes(18);
         System.out.println(" " + web.getMes());
         
        web.setDia(10);
         System.out.println(" " + web.getDia());
         
        web.setConsulta(10);
         System.out.println(" " + web.getConsulta());
    }
    
}
