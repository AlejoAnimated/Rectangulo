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
public class EscaladorTest {

    Rectangulo rect;
    Escalador escalador;

    @BeforeEach
    void setUp() {
        rect = new Rectangulo(4, 2);
        escalador = new Escalador();
    }

    @Test
    void testEscalarDuplicaTamaño() {
        escalador.escalar(rect, 2);
        assertEquals(8, rect.getX2());
        assertEquals(4, rect.getY2());
    }

    @Test
    void testMoverFiguraDesplazaCorrectamente() {
        escalador.moverFigura(rect, 1, -1);
        assertEquals(5, rect.getX2());
        assertEquals(1, rect.getY2());
    }

}
