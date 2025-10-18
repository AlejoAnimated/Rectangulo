/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author juank
 */
public abstract class Figura {

    public abstract double area();

    public abstract void mover(double dx, double dy);

    @Override
    public String toString() {
        return "Figura genérica";
    }

}
