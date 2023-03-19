import java.time.LocalDate;

public class Ejercicioi_1 {
    /*El objetivo es crear un programa que permita a una empresa de alquiler de bicicletas, mostrar los modelos que se ofrecen en alquiler y los precios.

Se pueden alquilar bicicletas, segways y giroscopios. Para todos, es necesario conocer su marca, modelo y fecha de compra. Las bicicletas están equipadas con un sistema de cambio de marchas. Algunas tienen más velocidades que otras. Los segways y los giroscopios tienen cierta autonomía en kilómetros. Debido a su manillar, el Segway requiere que su piloto tenga una altura mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de compra.*/

    //Apartado a: Definir las clases necesarias para representar los distintos ciclos ofrecidos para el alquiler. Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.

    /*Apartado b: Es necesario conocer la tarifa de alquiler de todos los ciclos.

bici

tarifa horaria de alquiler

bicicleta

4,90 €

segway

18,90 €

giroscopios

29,90 €

Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello. También agregue un constructor y un método que será útil para mostrar estas bicis en cada uno de ellos.*/
}

public class Bicicleta {
    private String marca;
    private String modelo;
    private LocalDate fechaCompra;
    private int cambioMarchas;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int cambioMarchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.cambioMarchas = cambioMarchas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCambioMarchas() {
        return cambioMarchas;
    }

    public void setCambioMarchas(int cambioMarchas) {
        this.cambioMarchas = cambioMarchas;
    }


    public double tarifaBici() {
        return 4.90;
    }

    public double tarifaSegway() {
        return 18.90;
    }

    public double tarifaGiroscopio() {
        return 29.90;
    }

    public void mostrarBicis() {
        System.out.println("Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", cambioMarchas=" + cambioMarchas +
                '}');
    }

}