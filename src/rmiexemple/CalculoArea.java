package rmiexemple;

import java.rmi.RemoteException;

public interface CalculoArea 
       extends java.rmi.Remote { 
           public Double calculaAreaRetangulo(long base, long altura) 
                 throws java.rmi.RemoteException;
           public Double calculaAreaTriangulo(long base, long altura) 
                 throws java.rmi.RemoteException; 
           public Double calculaAreaCirculo(long raio) 
                 throws java.rmi.RemoteException;
}
