/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public class Punto extends Figura {

    private double coordx;
    private double coordy;

    public Punto() {
        this(0, 0);
    }

    public Punto(double coordx, double coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public double getX() {
        return coordx;
    }

    public double getY() {
        return coordy;
    }

    public void setX(double coordx) {
        this.coordx = coordx;
    }

    public void setY(double coordy) {
        this.coordy = coordy;
    }

    @Override
    public void mover(double dx, double dy) {
        this.coordx += dx;
        this.coordy += dy;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Punto(" + coordx + ", " + coordy + ")";
    }

}
