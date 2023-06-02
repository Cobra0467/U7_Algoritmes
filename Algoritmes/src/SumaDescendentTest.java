import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumaDescendentTest {

    SumaDescendent suma = new SumaDescendent();

    @Test
    void testSuma54321() {
        int resultadoActual = suma.suma(54321);
        int resultadoEsperado = 58985;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testSumaMenos1234() {
        int resultadoActual = suma.suma(-1234);
        int resultadoEsperado = 272;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testSuma2222() {
        int resultadoActual = suma.suma(2222);
        int resultadoEsperado = 2468;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    void testSuma783462() {
        int resultadoActual = suma.suma(783462);
        int resultadoEsperado = 870912;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}
