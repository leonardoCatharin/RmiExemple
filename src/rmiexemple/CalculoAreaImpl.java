package rmiexemple;

import java.rmi.Naming;
import java.rmi.RemoteException;
import rmiexemple.CalculoArea;

public class CalculoAreaImpl extends java.rmi.server.UnicastRemoteObject implements CalculoArea {
           public CalculoAreaImpl() 
                throws java.rmi.RemoteException { 
                    super();
           } 
           public Double calculaAreaRetangulo(long base, long altura) 
                 throws java.rmi.RemoteException { 
                     return Double.valueOf(base * altura); 
           }
           public Double calculaAreaTriangulo(long base, long altura) 
                 throws java.rmi.RemoteException { 
                     return Double.valueOf((base * altura) / 2); 
           } 
           public Double calculaAreaCirculo(long raio) 
                 throws java.rmi.RemoteException {
                     return 2 * raio * Math.PI; 
           }
}