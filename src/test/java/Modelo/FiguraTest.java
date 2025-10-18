/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author efrai
 */
public class FiguraTest {

    Figura figura = new Figura() {
        @Override
        public double area() {
            return 10;
        }

        @Override
        public void mover(double dx, double dy) {
            // No implementa nada
        }
    };

    @Test
    void testAreaAbstracta() {
        assertEquals(10, figura.area());
    }

    @Test
    void testMoverNoRompe() {
        assertDoesNotThrow(() -> figura.mover(1, 1));
    }

}
