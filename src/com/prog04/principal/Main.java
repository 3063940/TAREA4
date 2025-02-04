package com.prog04.principal;

import com.prog04.figuras.Rectangulo;

public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);

        System.out.println("Base: " + rectangulo.getBase());

        System.out.println("La base del rectángulo es: " + rectangulo.getBase());
        System.out.println("El altura es: " + rectangulo.getAltura());
        System.out.println("El área de rectángulo es " + rectangulo.getArea());

        System.out.println(); // para que vuelva a salir una frase:
            if (rectangulo.isCuadrado()) {
                System.out.println("El rectángulo es un cuadrado.");
            }
            else {
                System.out.println("El rectángulo no es un cuadrado.");
            }
    }
}
