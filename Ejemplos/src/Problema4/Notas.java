package Problema4;

public class Notas {
 
    private int contadorTodos = 0;
    private int contadorABC = 0;
    private int contadorABCD = 0;

    public int getContadorTodos() {
        return contadorTodos;
    }

    public void setContadorTodos(int contadorTodos) {
        this.contadorTodos = contadorTodos;
    }

    public int getContadorABC() {
        return contadorABC;
    }

    public void setContadorABC(int contadorABC) {
        this.contadorABC = contadorABC;
    }

    public int getContadorABCD() {
        return contadorABCD;
    }

    public void setContadorABCD(int contadorABCD) {
        this.contadorABCD = contadorABCD;
    }
    
        
    
    public void NotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5){
       Notas objNotas = new Notas(); 
        
        if ((nota1>3 && nota1<5) && (nota2>3 && nota2<5) && (nota3>3 && nota3<5) && (nota4>3 && nota4<5) && (nota5>3 && nota5<5)) {
                contadorTodos++;
                objNotas.setContadorTodos(contadorTodos);
        } 
        
        if(((nota1>3 && nota1<5)&& (nota2>3 && nota2<5) && (nota3>3 && nota3<3)) || ((nota4>3 && nota4<5) && (nota5>3 && nota5<5))){
            
                contadorABC++;
                objNotas.setContadorABC(contadorABC);
        }
        
        if ((((nota1>3 && nota1<5)&& (nota2>3 && nota2<5)) || ((nota3>3 && nota3<3) || (nota4>3 && nota4<5))) && ((nota5>0 && nota5<3))){
                contadorABCD++;
                objNotas.setContadorABCD(contadorABCD);
        }

    }
    
}
