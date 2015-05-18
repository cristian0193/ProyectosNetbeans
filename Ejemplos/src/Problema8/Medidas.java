
package Problema8;

import javax.swing.JOptionPane;


public class Medidas {
    
    private double metro = 100;
    private double pulgada = 2.54;
    private double pie = 12;
    private double yarda = 3;
    
    public double Convertidor(int opcionSeleccionada , double datoConvertir){
        double valor = 0;
        
        if (opcionSeleccionada == 0) {
            JOptionPane.showMessageDialog(null,"SELECCIONE UNA OPCION");
        }else if (opcionSeleccionada == 1){
            valor = metro*datoConvertir;
        }else if (opcionSeleccionada == 2){    
            valor = pulgada*datoConvertir;
        }else if (opcionSeleccionada == 3){
            valor = pie*datoConvertir;
        }else{
            valor = yarda*datoConvertir;
        }
        
        
        return  valor;
    }
    
}
