package rmiexemple;

import java.rmi.Naming; 

public class CalculoAreaServer { 
   
   public CalculoAreaServer() { 
      try { 
            CalculoArea c = new CalculoAreaImpl(); 
            Naming.rebind("//localhost/CalculoAreaServer", c); 
      } catch (Exception e) { 
            System.out.println("Trouble: " + e); 
      }
   } 
   
   public static void main(String args[]) { 
         new CalculoAreaServer();
   }
} 