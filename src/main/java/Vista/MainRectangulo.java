/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

/**
 *
 * @author juank
 */
import Modelo.Rectangulo;
import javax.swing.JOptionPane;

public class MainRectangulo {

    public static void main(String[] args) {
        try {
            int x2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la coordenada X del vértice opuesto al origen (0,0):"));
            int y2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la coordenada Y del vértice opuesto al origen (0,0):"));

            Rectangulo rect = new Rectangulo(x2, y2);
            JOptionPane.showMessageDialog(null, "Rectángulo creado:\n" + rect);

            int opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("Seleccione el tipo de dibujo:\n1. Con relleno\n2. Sin relleno")
            );

            boolean conRelleno = (opcion == 1);
            JOptionPane.showMessageDialog(null, rect.dibujarRectangulo(conRelleno));

            int px = Integer.parseInt(JOptionPane.showInputDialog("Introduce la coordenada X del punto a comprobar:"));
            int py = Integer.parseInt(JOptionPane.showInputDialog("Introduce la coordenada Y del punto a comprobar:"));

            if (rect.contienePunto(px, py)) {
                JOptionPane.showMessageDialog(null, "El punto (" + px + ", " + py + ") está DENTRO del rectángulo.");
            } else {
                JOptionPane.showMessageDialog(null, "El punto (" + px + ", " + py + ") está FUERA del rectángulo.");
            }

            int dx = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuántas unidades quieres modificar en X (positivas agrandan, negativas reducen):"));
            int dy = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuántas unidades quieres modificar en Y (positivas agrandan, negativas reducen):"));

            rect.mover(dx, dy);

            JOptionPane.showMessageDialog(null, "Rectángulo actualizado:\n" + rect);
            JOptionPane.showMessageDialog(null, rect.dibujarRectangulo(conRelleno));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce solo números válidos.");
        }
    }

}
