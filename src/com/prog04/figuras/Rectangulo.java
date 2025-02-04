package com.prog04.figuras;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {}

    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public float getArea() {
        return (float) (this.base * this.altura);
    }

    @Override

    public String toString() {
        return "Si multiplicamos la base " + base + " por la altura " + altura + " tenemos el área = " + getArea();
    }

    public boolean isCuadrado() {
        return this.base == this.altura;
    }


}


