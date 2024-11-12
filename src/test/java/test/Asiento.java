package test;

import java.util.Arrays;

public class Asiento {
    String color;
    int precio;
    int registro;
    String[] coloresPosibles = {"rojo", "verde", "amarillo", "negro", "blanco"};

    public void cambiarColor(String color){
        if (Arrays.asList(coloresPosibles).contains(color)){
            this.color = color;
        }
    }
}