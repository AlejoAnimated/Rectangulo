/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author efrai
 */
public class RectanguloIT {

    Rectangulo rect;

    @BeforeEach
    void setUp() {
        rect = new Rectangulo(4, 3);
    }

    @Test
    void testAreaYPerimetro() {
        assertEquals(12, rect.calcularArea());
        assertEquals(14, rect.calcularPerimetro());
    }

    @Test
    void testContienePuntoDentro() {
        assertTrue(rect.contienePunto(2, 1));
    }

    @Test
    void testContienePuntoFuera() {
        assertFalse(rect.contienePunto(5, 4));
    }

    @Test
    void testMoverIncrementaDimensiones() {
        rect.mover(2, -1);
        assertEquals(6, rect.getX2());
        assertEquals(2, rect.getY2());
    }

    @Test
    void testAreaImplementadaDesdeFigura() {
        assertEquals(12, rect.area());
    }

}
