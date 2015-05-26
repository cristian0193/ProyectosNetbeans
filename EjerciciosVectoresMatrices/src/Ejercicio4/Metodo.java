
package Ejercicio4;

import javax.swing.JOptionPane;


public class Metodo {
   
int VectorIngreso[];
int mayor = 0;
int pos = 0;
    
public int LlenarVector(int cantiadd){
   
    Metodo o = new Metodo();
    
    for (int i = 0; i < cantiadd; i++) {
        
         VectorIngreso = new int[cantiadd];            
         VectorIngreso[i] = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO : " + i));       
               
    }
   
    mayor = VectorIngreso[0];
    
    for (int f = 1; f < VectorIngreso.length; f++) {
        if (VectorIngreso[f] > mayor) {
            mayor = VectorIngreso[f];
            pos = f;
        }
    }
 
   return mayor;
    
}    
    
   
    
}
