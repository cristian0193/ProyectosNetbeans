package Problema_11;

import javax.swing.JOptionPane;


public class Utilidades {
    
    
    public double UtilidaesSalario(int opcionSeleccionada , double salario){
        double valor = 0;
        
        if (opcionSeleccionada == 0) {
            JOptionPane.showMessageDialog(null,"SELECCIONE UNA OPCION");
        }else if (opcionSeleccionada == 1){
            valor = salario*0.05;
        }else if (opcionSeleccionada == 2){    
            valor = salario*0.07;
        }else if (opcionSeleccionada == 3){
            valor = salario*0.10;
        }else if (opcionSeleccionada == 4){
            valor = salario*0.15;
        }else if (opcionSeleccionada == 5){
            valor = salario*0.20;
        }

        return  valor;
    }
    
}
