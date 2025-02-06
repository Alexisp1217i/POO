/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_modificadores;

/**
 *
 * @author nancy
 */
public class Persona {
    //ATRIBUTOS
  private  String nombre; 
  private String apellido;
  private    int edad;
  private  String genero;
  private  String curp;
    //CONSTRUCCION
    //METODOS
  //metodos get y set
  public String getNombre(){
      return nombre;
  }
  public void setNombre(String valor){
      nombre = valor;
  }
  public String getApellido(){
     return apellido;    
  }
  public void setApellidos(String valor){
      apellido = valor;
  }
  public int getEdad(){
     return edad;    
  }
  public void setEdad(int valor){
      edad = valor;
  }
  public String getGenero(){
     return genero;    
  }
  public void setGenero(String valor){
      genero = valor;
  }
  public String getCurp(){
     return curp;    
  }
  public void setCurp(String valor){
      curp = valor;
  }
  
}
