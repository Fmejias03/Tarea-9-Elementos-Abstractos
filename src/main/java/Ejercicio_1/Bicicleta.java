package Ejercicio_1;

import java.time.LocalDate;

public class Bicicleta extends Cycle {
    private int numCambios;

    public Bicicleta(String marca, String modelo, LocalDate fechaFabricacion, int numCambios) {
        super(marca, modelo, fechaFabricacion);
        this.numCambios = numCambios;
    }

    public double getAlquilerHora() {
        return 4.90;
    }

    public String toString(){
        return String.format("%s %s (%d años) %d cambios", getMarca(), getModelo(),
                LocalDate.now().getYear() - getFechaFabricacion().getYear(), numCambios);
    }


}
