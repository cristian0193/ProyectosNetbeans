
package Problema9;

import javax.swing.JOptionPane;


public class Electrodomesticos {
    
    private double valorTotal = 0;
    private double valorIVA = 0;
    private double valorPagar = 0;
    private double trasporte = 0;
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorIVA() {
        return valorIVA;
    }

    public void setValorIVA(double valorIVA) {
        this.valorIVA = valorIVA;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getTrasporte() {
        return trasporte;
    }

    public void setTrasporte(double trasporte) {
        this.trasporte = trasporte;
    }
    
    
    
    
    
    public void CalculoTotal(int cantidad, int opcionElectrodomestico){
        Electrodomesticos obj = new Electrodomesticos();        
        
        if (opcionElectrodomestico == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE ELECTODOMESTICO");
        }else if(opcionElectrodomestico == 1){
           
            trasporte = 15000;
            valorTotal = cantidad * 1200000;
            valorIVA = ((valorTotal*0.20));
            valorPagar = valorTotal + valorIVA + 15000;
            
            obj.setTrasporte(trasporte);
            obj.setValorTotal(valorTotal);
            obj.setValorIVA(valorIVA);
            obj.setValorPagar(valorPagar);
            
        }else if(opcionElectrodomestico == 2){
            
            trasporte = 10000;
            valorTotal = cantidad * 790000;
            valorIVA = ((valorTotal*0.20));
            valorPagar = valorTotal + valorIVA + 10000;
            
            obj.setTrasporte(trasporte);
            obj.setValorTotal(valorTotal);
            obj.setValorIVA(valorIVA);
            obj.setValorPagar(valorPagar);
            
        }else if(opcionElectrodomestico == 3){
            
            trasporte = 5000;
            valorTotal = cantidad * 480000;
            valorIVA = ((valorTotal*0.20));
            valorPagar = valorTotal + valorIVA + 5000;
            
            obj.setTrasporte(trasporte);
            obj.setValorTotal(valorTotal);
            obj.setValorIVA(valorIVA);
            obj.setValorPagar(valorPagar);
            
        }else if(opcionElectrodomestico == 4){
            
            trasporte = 7000;
            valorTotal = cantidad * 1000000;
            valorIVA = ((valorTotal*0.20));
            valorPagar = valorTotal + valorIVA + 7000;    
            
            obj.setTrasporte(trasporte);
            obj.setValorTotal(valorTotal);
            obj.setValorIVA(valorIVA);
            obj.setValorPagar(valorPagar);
            
        }else if(opcionElectrodomestico == 5){
            
            trasporte = 10000;
            valorTotal = cantidad * 580000;
            valorIVA = (valorTotal*0.20);
            valorPagar = valorTotal +  valorIVA + 10000;
            
            obj.setTrasporte(trasporte);
            obj.setValorTotal(valorTotal);
            obj.setValorIVA(valorIVA);
            obj.setValorPagar(valorPagar);
            
        }
    }         
    
    
    
}
