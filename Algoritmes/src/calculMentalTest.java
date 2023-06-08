import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * La clase `calculMentalTest` realiza pruebas unitarias para la clase `calculMental`.
 * @author Iván Ibáñez
 * @title Tasca3 EEDD
 */
public class calculMentalTest {

    /**
     * Prueba el método `calcula()` de la clase `calculMental` con una secuencia de operaciones.
     * Verifica si los resultados parciales son correctos.
     */
    @Test
    void testCalcula() {
        String secuencia = "15 + 8 - 7 + 10 - 3";
        calculMental calculadora = new calculMental(secuencia);
        List<Integer> resultados = calculadora.calcula();

        Assertions.assertEquals(23, resultados.get(0));
        Assertions.assertEquals(16, resultados.get(1));
        Assertions.assertEquals(26, resultados.get(2));
        Assertions.assertEquals(23, resultados.get(3));
    }

    /**
     * Prueba el método `calcula()` de la clase `calculMental` con una única operación.
     * Verifica si el resultado parcial es correcto.
     */
    @Test
    void testCalculaUnaOperacion() {
        String secuencia = "10 + 5";
        calculMental calculadora = new calculMental(secuencia);
        List<Integer> resultados = calculadora.calcula();

        Assertions.assertEquals(15, resultados.get(0));
    }

    /**
     * Prueba el método `calcula()` de la clase `calculMental` con operaciones negativas.
     * Verifica si los resultados parciales son correctos.
     */
    @Test
    void testCalculaOperacionesNegativas() {
        String secuencia = "5 - 3 + 8 - 12";
        calculMental calculadora = new calculMental(secuencia);
        List<Integer> resultados = calculadora.calcula();

        Assertions.assertEquals(2, resultados.get(0));
        Assertions.assertEquals(10, resultados.get(1));
        Assertions.assertEquals(-2, resultados.get(2));
    }
}
