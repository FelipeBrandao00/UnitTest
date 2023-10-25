import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(13,calculadora.soma(10,3));
    }

    @Test
    void divisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.divisao(10,2));
    }

    @Test
    void produto() {
        Calculadora calculadora = new Calculadora();
        assertEquals(30,calculadora.produto(10,3));
    }

    @Test
    void diferenca() {
        Calculadora calculadora = new Calculadora();
        assertEquals(7,calculadora.diferenca(10,3));
    }
}