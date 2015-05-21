
package Ejercicio1;

import javax.swing.JOptionPane;


public class Metodo {
    
    
    
    public int SumaVector(int numero){
        
        int TotalSuma[] = new int[numero];
        int Suma = 0;
        
        for (int i = 0; i < TotalSuma.length; i++) {
            
            TotalSuma[i] = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO : " + i));
            Suma += TotalSuma[i];          
        }
        
        
        return Suma;
    }
    
}
