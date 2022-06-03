package com.generation.f20220602;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrabajoTest {
    @Test
    public void testPresente() {
        Alumno alumno = new Alumno();
        String resultado = alumno.presente();//true

        assertEquals("Presente", resultado);//cuando esta presente

    }

}
