package org.example.Ejemplo1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestUnitariosTest {

    @Test
    void calcularMultiplicacion() {
        TestUnitarios testUnitarios = new TestUnitarios();

        int resultao = testUnitarios.calcularMultiplicacion(2, 5);
        assertEquals(10, resultao);
    }

    @Test
    void concatenarCadenas() {
        TestUnitarios testUnitarios = new TestUnitarios();

        String concatenar = testUnitarios.concatenarCadenas("hola ", "que tal");
        assertEquals("hola que tal", concatenar);
    }

    @Test
    void esPar() {
        TestUnitarios testUnitarios = new TestUnitarios();

        boolean primerNumero = testUnitarios.esPar(4);
        assertTrue(primerNumero);

        boolean segundoNumero = testUnitarios.esPar(5);
        assertFalse(segundoNumero);
    }

    @Test
    void convertirAMinusculas() {
        TestUnitarios testUnitarios = new TestUnitarios();

        String conversion = testUnitarios.convertirAMinusculas("YIYOOOOO YIYOO YIYO");
        assertNotEquals("YIYOOOOO YIYOO YIYO", conversion);
    }

    @Test
    void contarVocales() {
        TestUnitarios testUnitarios = new TestUnitarios();

        int frase = testUnitarios.contarVocales("holaquetal");

        assertEquals(5, frase);
    }

    @Test
    void esPalindroma() {
        TestUnitarios testUnitarios = new TestUnitarios();

        boolean reversa1 = testUnitarios.esPalindroma("aerea");
        assertTrue(reversa1);

        boolean reversa2 = testUnitarios.esPalindroma("yiyo");
        assertFalse(reversa2);
    }

    @Test
    void calcularAreaCuadrado() {
        TestUnitarios testUnitarios = new TestUnitarios();

        double area1 = testUnitarios.calcularAreaCuadrado(5.0);
        assertEquals(25, area1);

        double area2 = testUnitarios.calcularAreaCuadrado(7.0);
        assertNotEquals(48.9, area2);

    }

    @Test
    void calcularHipotenusa() {
        TestUnitarios testUnitarios = new TestUnitarios();

        double calculo1 = testUnitarios.calcularHipotenusa(7, 6);

        assertEquals(9.219544457292887, calculo1);
    }

    @Test
    void calcularDivision() {
        TestUnitarios testUnitarios = new TestUnitarios();

        double calculo1 = testUnitarios.calcularDivision(5, 2);
        assertEquals(2.5, calculo1);
    }

    @Test
    void encontrarMaximo() {
        TestUnitarios testUnitarios = new TestUnitarios();

//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(2);
//        integerList.add(4);
//
//        List<Integer> si= (List<Integer>) testUnitarios.encontrarMaximo(integerList);
    }

    @Test
    void eliminarDuplicados() {
        TestUnitarios testUnitarios = new TestUnitarios();
    }
}