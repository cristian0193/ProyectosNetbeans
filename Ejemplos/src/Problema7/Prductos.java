
package Problema7;

import javax.swing.JOptionPane;


public class Prductos {
    
    private int productoX = 0;
    private int productoY = 0;    

    public int getProductoX() {
        return productoX;
    }

    public void setProductoX(int productoX) {
        this.productoX = productoX;
    }

    public int getProductoY() {
        return productoY;
    }

    public void setProductoY(int productoY) {
        this.productoY = productoY;
    }
    
    public int PrecioTotal(int opcionProducto,int opcionVenta, int cantidad){
        
        int ventacostoLocalX = 150;
        int ventacostoLocalY = 130;
        int ventacostoInterX = 200;
        int ventacostoInterY = 250;
        int totalCosto = 0;
        
        Prductos obj = new Prductos();
        
        if (opcionProducto == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN PRODUCTO");
        } else if(opcionProducto == 1){
            
            if (opcionVenta == 0) {
                 JOptionPane.showMessageDialog(null, "SELECCIONE UN VENTA");
            } else if (opcionVenta == 1){
                totalCosto = ventacostoLocalX * cantidad;
                obj.setProductoX(totalCosto);
            }else{
                totalCosto = ventacostoInterX * cantidad;
                obj.setProductoX(totalCosto);
            }

        }else{
            
             if (opcionVenta == 0) {
                 JOptionPane.showMessageDialog(null, "SELECCIONE UN VENTA");
            } else if (opcionVenta == 1){
                totalCosto = ventacostoLocalY * cantidad;
                obj.setProductoX(totalCosto);
            }else{
                totalCosto = ventacostoInterY * cantidad;
                obj.setProductoX(totalCosto);
            }
             
        }
    
        return totalCosto;
        
    }
    
    
    
}
