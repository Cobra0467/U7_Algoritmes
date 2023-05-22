import static org.junit.jupiter.api.Assertions.*;

class HyperParTest {

    HyperPar hyper = new HyperPar();

    @org.junit.jupiter.api.Test
    void Prueba1() {
        boolean resultadoActual = hyper.HyperPar(823283);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void Prueba2() {
        boolean resultadoActual = hyper.HyperPar(28648264);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void Prueba3() {
        boolean resultadoActual = hyper.HyperPar(24864826);
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @org.junit.jupiter.api.Test
    void Prueba4() {
        boolean resultadoActual = hyper.HyperPar(925730947);
        boolean resultadoEsperado = false;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}