
package Problema6;

import javax.swing.JOptionPane;


public class Buses {
   
    
    private int corriente;
    private int ejecutivo;
    private int ruta;
    private double salario;
    private double mantenimiento;

    public int getCorriente() {
        return corriente;
    }

    public void setCorriente(int corriente) {
        this.corriente = corriente;
    }

    public int getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(int ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
    
    
    public void CalculoSalarioMantenimiento(int opcionBus,int opcionRuta,double salario,double mantenimiento){
        Buses objBus = new Buses();
        
        int precioCorriente = 800;
        int precioEjecutivo = 1100;
        double resultadoCorrienteSalario = 0;
        double resultadoCorrienteMante = 0;
        double valorSalario = 0;
        double valorMantenimiento = 0;
        
        if (opcionBus == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION DE BUS");
        } else if (opcionBus == 1){
                                   
            if (opcionRuta == 0) {
                 JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION DE RUTA");
            }else if (opcionRuta == 1) {
                resultadoCorrienteSalario = precioCorriente * 0.30;
                resultadoCorrienteMante = precioCorriente * 0.10;
                valorSalario = ((salario + (salario * 0.30))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.10))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }else if (opcionRuta == 2){
                resultadoCorrienteSalario = precioCorriente * 0.25;
                resultadoCorrienteMante = precioCorriente * 0.15;
                valorSalario = ((salario + (salario * 0.25))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.15))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }else{
                resultadoCorrienteSalario = precioCorriente * 0.20;
                resultadoCorrienteMante = precioCorriente * 0.20;
                valorSalario = ((salario + (salario * 0.20))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.20))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }
            
        }else{
            
            if (opcionRuta == 0) {
                 JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION DE RUTA");
            }else if (opcionRuta == 1) {                
                resultadoCorrienteSalario = precioEjecutivo * 0.30;
                resultadoCorrienteMante = precioEjecutivo * 0.10;
                valorSalario = ((salario + (salario * 0.30))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.10))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }else if (opcionRuta == 2){
                resultadoCorrienteSalario = precioEjecutivo * 0.25;
                resultadoCorrienteMante = precioEjecutivo * 0.15;
                valorSalario = ((salario + (salario * 0.25))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.15))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }else{
                resultadoCorrienteSalario = precioEjecutivo * 0.20;
                resultadoCorrienteMante = precioEjecutivo * 0.20;
                valorSalario = ((salario + (salario * 0.20))+resultadoCorrienteSalario);
                valorMantenimiento = ((mantenimiento + (mantenimiento * 0.20))+resultadoCorrienteMante);
                objBus.setSalario(valorSalario);
                objBus.setMantenimiento(valorMantenimiento);
            }
        }
        
        
        
    }
    
    
    
    
}
