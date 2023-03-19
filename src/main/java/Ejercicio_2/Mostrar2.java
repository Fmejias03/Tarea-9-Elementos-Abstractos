package Ejercicio_2;

import java.util.Scanner;

public class Mostrar2 {
    public void mostrar() {
       Scanner sc = new Scanner(System.in);
        System.out.println("¿En qué idioma desea que se muestre el programa?/¿In which language do you want the program to be displayed?");
        System.out.println("1. Español");
        System.out.println("2. Inglés");
        int idioma = sc.nextInt();

        Traduccion traduccion;

        if (idioma == 1) {
            traduccion = new Espanol();
        } else {
            traduccion = new Ingles();
        }


        traduccion.Distancia();
        double distancia = sc.nextDouble();

        traduccion.Tiempo();
        double tiempo = sc.nextDouble();

        double velocidad = distancia / tiempo;
        double velocidad2 = velocidad * 60;

        traduccion.inicioRespuesta();
        System.out.println(velocidad2);
        traduccion.finRespuesta();

    }
}
