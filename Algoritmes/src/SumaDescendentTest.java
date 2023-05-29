import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {

    SumaDescendent suma = new SumaDescendent();

    @Test
    void sumaDescendent1() {
        SumaDescendent sumaDescendent = new SumaDescendent(4578);
        Assertions.assertEquals(5242, sumaDescendent.suma());
    }
}