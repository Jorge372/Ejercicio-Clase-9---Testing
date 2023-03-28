package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class CalculadoraTest {

    Calculadora c;
    @BeforeAll
    public static void inicio(){
        System.out.println("Iniciando pruebas...");
    }
    @AfterAll
    public static void fin(){
        System.out.println("Pruebas finalizadas exitosamente.");
    }

    @BeforeEach
    public void individual(){
        c = new Calculadora();
    }
    @Test
    void multiplicar() {
        assertEquals(240,c.multiplicar(80,3));
    }

    @Test
    void sumaryDividir() {
        assertEquals(110,c.dividir(c.sumar(150,180),3));
    }

    @Test
    void restaryMultiplicar() {
        assertNotEquals(605,c.multiplicar(c.restar(90,50),15));
    }

    @Test
    void sumaryMultiplicar() {
        assertNotEquals(2700,c.multiplicar(c.sumar(70,40),25));
    }
}