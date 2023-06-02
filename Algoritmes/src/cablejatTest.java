import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CablejatTest {

    cablejat cablejat = new cablejat();

    @Test
    void testVerificarConexionesDosMachos() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("MM");
        cables.add("MF");
        cables.add("FM");
        cables.add("FF");

        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = true;

        assertEquals(esperado, actual);
    }

    @Test
    void testVerificarConexionesDosHembras() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MF");

        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = false;

        assertEquals(esperado, actual);
    }

    @Test
    void testVerificarConexionesVariados() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MF");
        cables.add("MM");
        cables.add("MF");
        cables.add("FM");
        cables.add("FF");

        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = false;

        assertEquals(esperado, actual);
    }

    @Test
    void testVerificarConexionesCorrecto() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MM");
        cables.add("MM");
        cables.add("FF");
        cables.add("FM");
        cables.add("MF");

        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = true;

        assertEquals(esperado, actual);
    }

    @Test
    void testVerificarConexionesVariosTipos() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("MM");
        cables.add("FF");
        cables.add("MM");
        cables.add("MF");
        cables.add("MF");
        cables.add("MM");
        cables.add("FF");

        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = true;

        assertEquals(esperado, actual);
    }

    @Test
    void testVerificarConexionesMuchos() {
        ArrayList<String> cables = new ArrayList<>();
        cables.add("FF");
        cables.add("FM");
        cables.add("MF");
        cables.add("FF");
        cables.add("MF");
        cables.add("FF");
        cables.add("MF");
        cables.add("FF");
        cables.add("FM");
        cables.add("FF");
        cables.add("MF");
        cables.add("FF");
        cables.add("MF");
        cables.add("FM");
        boolean actual = cablejat.esPotConnectar(cables);
        boolean esperado = false;

        assertEquals(esperado, actual);
    }
}
