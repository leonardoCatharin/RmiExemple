package rmiexemple;

import java.rmi.Naming; 

public class CalculoAreaCliente { 
   public static void main(String[] args) {
              
      try { 
              CalculoArea c = 
                      (CalculoArea) Naming.lookup( "//localhost/CalculoAreaServer");
              System.out.println("Area do retangulo: " + c.calculaAreaRetangulo(10, 20) ); 
              System.out.println("Area do triangulo: " + c.calculaAreaTriangulo(10, 20) ); 
              System.out.println("Area do circulo: " + c.calculaAreaCirculo(10) ); 
      } 
        catch (Exception e) {
              System.out.println(e);
      } 
   }
} 