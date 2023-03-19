package Ejercicio_1;

import java.util.Scanner;

public class Mostrar1 {

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, bienvenido a la tienda de alquiler de bicicletas, segways y giroscopios");
        System.out.println("Este es nuestro catalogo: ");
        System.out.println("Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora");
        System.out.println("Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora ");
        System.out.println("Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora");
        System.out.println("Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora");
        System.out.println("Segway Ninebot One E+ (0 años) 30 km de autonomía               18,90€/hora");

        int opcion = sc.nextInt();

        System.out.println("¿Que desea alquilar? (1-4)");
        System.out.println("1. Bicicleta");
        System.out.println("2. Giroscopio");
        System.out.println("3. Segway");
        System.out.println("4. Salir");

        if (opcion == 1){
            System.out.println("¿Que bicicleta desea alquilar? (1-2)");
            System.out.println("1. Bicis Lapierre speed 400 (1 año) 27 velocidades");
            System.out.println("2. Bicis Btwin riverside 900 (0 años) 10 velocidades");
            int opci = sc.nextInt();

            //if ()

        }




    }

}
