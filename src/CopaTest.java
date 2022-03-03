import static org.junit.jupiter.api.Assertions.*;

class CopaTest {

    @org.junit.jupiter.api.Test
    void getTipoLiquido() {
        Copa c = new Copa("Zumo de naranja",85.5);
                                   assertEquals("Zumo de naranja",c.getTipoLiquido());
    }
}