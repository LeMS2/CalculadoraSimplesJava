import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(-2, 2));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-4, calc.subtrair(2, 6));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(0, 5));
        assertEquals(-10, calc.multiplicar(-2, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.dividir(10, 5));
        // Teste para divisão por zero (exemplo lançando ArithmeticException)
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
