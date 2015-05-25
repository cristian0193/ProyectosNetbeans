package Ejercicio2;

import javax.swing.JOptionPane;


public class Metodo {

     
    
    public String CalculoTotal (int cantidad){

        int cedula[] = new int[cantidad];
        double salarios[] = new double[cantidad];
        double asignacion[] = new double[cantidad];
        double deducciones[] = new double[cantidad];
        double total[] = new double[cantidad];
        String mensaje = "";
        
        for (int i = 0; i < salarios.length; i++) {
          
          cedula[i] =  Integer.parseInt(JOptionPane.showInputDialog("INGRESE CEDULA DE TRABAJADOR : " + i)); 
          salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("INGRESE SALARIO DE TRABAJADOR : " + i));
          asignacion[i] = Double.parseDouble(JOptionPane.showInputDialog("INGRESE ASIGNACIONES DE TRABAJADOR : " + i));
          deducciones[i] = Double.parseDouble(JOptionPane.showInputDialog("INGRESE DEDUCCIONES DE TRABAJADOR : " + i));
          total[i] = ((salarios[i]+asignacion[i])-deducciones[i]);
            
        }
        
        for (int i = 0; i < salarios.length; i++) {
            
            mensaje+=" CEDULA :     " +cedula[i]+ "   SALARIO :     " +salarios[i]+ "     ASIGNACIONES :      " +asignacion[i]+ "       DEDUCCIONES:     " +deducciones[i]+ "     TOTAL A PAGAR:     " +total[i]+ "\n";
        }
        
        
        return mensaje;
    }
    
    
    
}
