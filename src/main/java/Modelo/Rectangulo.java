/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class Rectangulo extends Figura {

    private int coordx2;
    private int coordy2;

    public Rectangulo(int coordx2, int coordy2) {
        this.coordx2 = coordx2;
        this.coordy2 = coordy2;
    }

    public int getX2() {
        return coordx2;
    }

    public int getY2() {
        return coordy2;
    }

    public void setX2(int coordx2) {
        this.coordx2 = coordx2;
    }

    public void setY2(int coordy2) {
        this.coordy2 = coordy2;
    }

    public int calcularBase() {
        return Math.abs(coordx2);
    }

    public int calcularAltura() {
        return Math.abs(coordy2);
    }

    public int calcularArea() {
        return calcularBase() * calcularAltura();
    }

    public int calcularPerimetro() {
        return 2 * (calcularBase() + calcularAltura());
    }

// El mover ahora significa "cambiar el tamaño" en base a las unidades que el usuario indique
    @Override
    public void mover(double dx, double dy) {
        this.coordx2 += dx;
        this.coordy2 += dy;
    }

    public String dibujarRectangulo() {
        return dibujarRectangulo(false);
    }

    public String dibujarRectangulo(boolean conRelleno) {
        String dibujo = "";
        int base = calcularBase();
        int altura = calcularAltura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1 || conRelleno) {
                    dibujo += "* ";
                } else {
                    dibujo += "  ";
                }
            }
            dibujo += "\n";
        }
        return dibujo;
    }

    public boolean contienePunto(int px, int py) {
        int xMin = 0, yMin = 0;
        int xMax = coordx2, yMax = coordy2;

        if (coordx2 < 0) {
            xMax = 0;
            xMin = coordx2;
        }
        if (coordy2 < 0) {
            yMax = 0;
            yMin = coordy2;
        }

        return (px >= xMin && px <= xMax && py >= yMin && py <= yMax);
    }

    @Override
    public double area() {
        return calcularArea();
    }

    @Override
    public String toString() {
        return "Rectángulo con vértices en (0,0) y (" + coordx2 + "," + coordy2 + ")"
                + "\nBase: " + calcularBase()
                + "\nAltura: " + calcularAltura()
                + "\nÁrea: " + calcularArea()
                + "\nPerímetro: " + calcularPerimetro();
    }

}
