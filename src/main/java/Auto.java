
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    public int cantidadAsientos(){
        int x = 0;
        for (int i = 0; i < asientos.length ; i++){
            x += 1;
        }
        return x;
    }

    public String verificarIntegridad() {

        if (motor.registro != this.registro) {
            return "Las piezas no son originales";
        }

        
        for (Asiento asiento : asientos) {
            if (asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }

        return "Auto original";
    }
}
