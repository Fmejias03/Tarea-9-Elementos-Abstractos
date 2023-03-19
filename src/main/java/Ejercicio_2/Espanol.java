package Ejercicio_2;

public class Espanol implements Traduccion {
    @Override
    public void Distancia() {
        System.out.println("Introduzca la distancia recorrida (km).");
    }

    @Override
    public void Tiempo() {
        System.out.println("Introduzca el tiempo del viaje (min).");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Se ha desplazado a una velocidad de ");
    }

    @Override
    public void finRespuesta() {
        System.out.println("km/h");
    }
}

