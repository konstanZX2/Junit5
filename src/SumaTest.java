import org.junit.jupiter.api.Test;

import javax.sound.sampled.LineEvent;
import java.awt.image.LookupOp;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    Suma suma1 = new Suma();
    @Test
    void sumar() {
        suma1.setAtributoTipoInt1(2);
        suma1.setAtributoTipoInt2(2);
        assertEquals(4,suma1.sumar());
    }

    @Test
    void sumarFalse() {
        suma1.setAtributoTipoInt1(2);
        suma1.setAtributoTipoInt2(3);
        assertNotEquals(6,suma1.sumar());

    }

}