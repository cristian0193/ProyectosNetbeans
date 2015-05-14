package Problema1;

import javax.swing.JOptionPane;

public class CajaCompensacion {
    
    public int cantidadTrabajadores = 0;

    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "cantidadTrabajadores=" + cantidadTrabajadores + '}';
    }
     
    public String Mensaje(int numero){
        int edadesHijos = 0;
        int sumas = 0;
        int total = 0;
        String mensaje = "";
        CajaCompensacion objCaja = new CajaCompensacion();
        
        for (int i = 1; i <= numero; i++) {
             int codigoTrabajador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo de Trabajador # " +i));
             int cantidadHijos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Hijos del Trabajador # " +i));
             
           for (int j = 1; j <= cantidadHijos; j++) {
                edadesHijos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Hijo # : " + j));
                sumas+=edadesHijos;
           }
            total = objCaja.valorPagar(sumas);
            mensaje +="CODIGO TRABAJADOR : " + codigoTrabajador +"\n"
                     +"NUMERO DE HIJOS : " + cantidadHijos +"\n"
                     +"SUMA DE EDADES : " + sumas +"\n"
                     +"TOTAL A PAGAR : " + total +"\n"
                     +"-------------------------------------- \n";
            
            sumas = 0;
        }

        return mensaje;
    }
    
    public int valorPagar(int suma){
     int valor = 0;
        
        if (suma<15) {
            valor = suma*5500;
        }else if(suma>15 && suma<20){
            valor = suma*3000;
        }else{
            valor = suma*2000;
        }
        
        return valor;
    }
    
    
    }
    

