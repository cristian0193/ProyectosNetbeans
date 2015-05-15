
package Problema3;

import javax.swing.JOptionPane;


public class EPS {
    
    public double cuota = 0;
    
    public double TotalConsulta(double salario, boolean primera,boolean urgencia,boolean medico, boolean especialista){
        
        if(primera==false && urgencia==false && medico==false && especialista==false){
            JOptionPane.showMessageDialog(null, "SELECCION UNA OPCION");
        }else if (primera == true || urgencia) {
            JOptionPane.showMessageDialog(null, "CONSULTA GRATUITA");
        } else if(medico == true){
            
            if(salario >= 0 && salario <425000){
                JOptionPane.showMessageDialog(null, "SALARIO NO APLICA");
            }else if (salario > 425000 && salario < 850000) {
                cuota = 1600;
            } else if (salario > 850001 && salario < 1700000){
                cuota = 6500;  
            } else{
                cuota = 16000;  
            }
            
        }else if(especialista == true){
            
            if(salario >= 0 && salario <425000){
                JOptionPane.showMessageDialog(null, "SALARIO NO APLICA");
            }else if (salario > 425000 && salario < 850000) {
                cuota = (1600+(1600*0.25));
            } else if (salario > 850001 && salario < 1700000){
                cuota = (6500+(6500*0.25));  
            } else{
                cuota = (16000+(16000*0.25));  
            }            
        }
        
        return cuota;
    }
    
}
