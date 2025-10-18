package Modelo;

/**
 * @author juank
 */
public class Escalador {

    public void escalar(Punto punto, double factor) {
        punto.setX(punto.getX() * factor);
        punto.setY(punto.getY() * factor);
    }

    public void escalar(Rectangulo rectangulo, double factor) {
        rectangulo.setX2((int) (rectangulo.getX2() * factor));
        rectangulo.setY2((int) (rectangulo.getY2() * factor));
    }

    public void moverFigura(Figura figura, double dx, double dy) {
        figura.mover(dx, dy);
    }

    @Override
    public String toString() {
        return "Clase que permite escalar o mover figuras geométricas";
    }

}
