package Ejercicio_1;

import java.time.LocalDate;

public abstract class Cycle {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaFabricacion;
    protected int numCambios;

    public Cycle(String marca, String modelo, LocalDate fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
    }
    //metodos
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    public abstract double getAlquilerHora();
    public String toString(){
        return String.format("%s %s (%d años)", getMarca(), getModelo(),
                LocalDate.now().getYear() - getFechaFabricacion().getYear());
    }

}