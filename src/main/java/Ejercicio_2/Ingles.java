package Ejercicio_2;

public class Ingles implements Traduccion {
    @Override
    public void Distancia() {
        System.out.println("Enter the distance traveled (km).");
    }

    @Override
    public void Tiempo() {
        System.out.println("Enter the time of the trip (min).");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Youre speed is: ");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Km/h");
    }
}
