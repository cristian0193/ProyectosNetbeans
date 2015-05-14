package Problema1;

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
    

