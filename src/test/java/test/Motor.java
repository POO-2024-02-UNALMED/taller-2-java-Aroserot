package test;
import java.util.Arrays;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    String[] tiposPosibles = {"galosina", "electrico"};
    
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        if (Arrays.asList(tiposPosibles).contains(tipo)){
            this.tipo = tipo;
        }
    }
    
}