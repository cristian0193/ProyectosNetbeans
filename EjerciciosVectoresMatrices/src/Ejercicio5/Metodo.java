
package Ejercicio5;


public class Metodo {
   
    int valorUnitario[] = {200,300,400,500,600};        
    int cantidad[] = {2,3,4,5,6};        
    String descripcion[] = {"PRODUCTO 1","PRODUCTO 2","PRODUCTO 3","PRODUCTO 4"};
    int Totales[] = new int[5];
    int TotalVentas = 0;
    String mensaje = "";
    
   public String cantidadTotal(){
       
       for (int i = 0; i < 5; i++) {
           Totales[i] = valorUnitario[i]*cantidad[i];
           mensaje += valorUnitario[i] + " - " + cantidad[i] + " - " + Totales[i]+"\n";
       }
       return  mensaje;
   }
    
   public int TotalVentas(){
       
        for (int i = 0; i < 5; i++) {
           
           TotalVentas += Totales[i];
       }
           
       return TotalVentas;
   }
   
   
}
