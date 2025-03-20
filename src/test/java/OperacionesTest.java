import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {
    @Test
    void testSuma() {
        assertEquals(5, Operaciones.suma(2, 3), "La suma debe ser correcta");
        assertEquals(0, Operaciones.suma(-1, 1), "Debe manejar números negativos");
    }
}