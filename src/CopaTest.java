import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopaTest {

    Copa c = new Copa("Zumo de UwU",20);
    @org.junit.jupiter.api.Test
    void getTipoLiquido() {

        assertEquals("Zumo de UwU", c.getTipoLiquido());
    }

    @Test
    void getPorcentajeLlena() {

        assertEquals(20, c.getPorcentajeLlena(), 0.001);
    }

    @Test
    void setTipoLiquido() {

        c.setTipoLiquido("Zumo de UwU");
        assertEquals("Zumo de UwU",c.getTipoLiquido());
    }

    @Test
    void setPorcentajeLlena() {

        c.setPorcentajeLlena(30);
        assertEquals(30,c.getPorcentajeLlena());
    }
}