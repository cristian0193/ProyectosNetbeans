
package Problema2;

import javax.swing.JOptionPane;

public class Productos {
    
    public int codigo;
    public int unidades;
    public int precioUnitario;
    
    
    
    public int TotalProducto(int cantidad, int producto){
        
        int valor = 0;
     
        if (producto == 0) {
             JOptionPane.showMessageDialog(null,"INGRESE UN PRODUCTO");
        } else if (producto == 1) {//TRAPEADOR
            if (cantidad < 500) {
                valor = cantidad * 2500;
            } else {
                valor = cantidad * 2300;
            }
        } else {//ESCOBA
            if (cantidad < 500) {
                valor = cantidad * 2200;
            } else {
                valor = cantidad * 1950;
            }
        } 
                                    
        return valor;
    }
    
    
    public double TotalIva(int total,int producto){
        double valor = 0;
       
        if (producto == 0) {
            JOptionPane.showMessageDialog(null, "INGRESE UN PRODUCTO");
        } else if (producto == 1) {//TRAPEADOR
            if (total < 50000) {
                valor = (total + (total * 0.14));
            } else {
                valor = (total + (total * 0.16));
            }
        } else {//ESCOBA
            if (total < 50000) {
                valor = (total + (total * 0.16));
            } else {
                valor = (total + (total * 0.16));
            }
        }

         return valor;
    }
    
//    public double TotalPagar(int total,int producto){
//        double valor = 0;
//        double totalPagar = 0;
//       
//        if (producto == 0) {
//            JOptionPane.showMessageDialog(null, "INGRESE UN PRODUCTO");
//        } else if (producto == 1) {//TRAPEADOR
//            if (total < 50000) {
//                valor = (total + (total * 0.14));
//                totalPagar+=valor;
//            } else {
//                valor = (total + (total * 0.16));
//                totalPagar+=valor;
//            }
//        } else {//ESCOBA
//            if (total < 50000) {
//                valor = (total + (total * 0.16));
//                totalPagar+=valor;
//            } else {
//                valor = (total + (total * 0.16));
//                totalPagar+=valor;
//            }
//        }
//
//         return totalPagar;
//    }
    
}
