
package Ejercicio3;

public class Metodo {
    
    private int numero = 0;
    private  int sumaPar = 0;
    private int sumaImpar = 0;
    
    
    public int SumaVectorImpar(){
         
        Metodo o = new Metodo();
        
        int TotalSuma[] = {2,3,4,5,6,7,8,9,13,56,75,66,43,21};        
        int sumaImPar = 0;        
        
        for (int i = 0; i < TotalSuma.length; i++) {
            
            numero = TotalSuma[i];   
            
            if (numero % 2 != 0) {
                sumaPar += numero;              
            }            
        }
        return sumaPar;
    }

     public int SumaVectorPar(){
         
        Metodo o = new Metodo();
        
        int TotalSuma[] = {2,3,4,5,6,7,8,9,13,56,75,66,43,21};        
        int sumaImPar = 0;        
        
        for (int i = 0; i < TotalSuma.length; i++) {
            
            numero = TotalSuma[i];
            
            if (numero % 2 == 0) {
                sumaImPar += numero;                 
            } 
                      
        }
        return sumaImPar;
    }
    
    
}

