/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_auto;

/**
 *
 * @author nancy
 */
public class VEHICULO {
    
    private String marca;
    private String modelo;
    private int year;
    private double precio;
    private String color;
   
    
    public void setMarca(String valor){
      marca = valor;
  }
    public String getMarca(){
      return marca;
  }
    public void setModelo(String valor){
     modelo = valor;
  }
    public String getModelo(){
      return modelo;
  }
    public void setYear(int valor){
      year = valor;
  }
    public int getYear(){
      return year;
  }
    public void setPrecio(double valor){
      precio = valor;
  }
    public double getPrecio(){
      return precio;
  }
    public void setColor(String valor){
      color =  valor;
    }
    public String getColor(){
      return color;
    }
    public void imprimirDatos(){
        System.out.println("Datos del Vehículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
}
