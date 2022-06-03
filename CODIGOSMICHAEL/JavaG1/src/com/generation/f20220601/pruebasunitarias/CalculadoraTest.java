package com.generation.f20220601.pruebasunitarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {

        Calculadora calc = new Calculadora();
        int resultado = calc.suma(24,33);
        assertEquals(57,
                resultado);

    }

    @org.junit.Test
    public void resta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(0, 22);
        assertEquals(-22,resultado);

    }

    @org.junit.Test
    public void multiplicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(2, 3);
        assertEquals(6,resultado);
        /*assertTrue(true);
        assertFalse(false);
        assertNull(null, resultado);
        assertNotNull(resultado);
        assertSame("Es igual" ,resultado);
        assertNotSame("No es igual", resultado);*/

    }

    @org.junit.Test
    public void division() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(10, 0);
        assertSame("No se puede dividir por 0", resultado);
    }

    @Test
    public void Pares() {
        Calculadora calc = new Calculadora();
        String par = calc.Pares(3);

        System.out.println(par);


    }




    //obtencion de numero par como metodo


    //obtencion de numero impar como metodo
}