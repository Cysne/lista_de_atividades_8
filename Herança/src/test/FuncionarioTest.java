import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void testFuncionario() {
        Funcionario funcionario = new Funcionario("Carlos", 3000.00);
        assertEquals("Carlos", funcionario.getNome());
        assertEquals(3000.00, funcionario.getSalario(), 0.01);

        funcionario.setNome("Carlos Silva");
        assertEquals("Carlos Silva", funcionario.getNome());

        funcionario.setSalario(3500.00);
        assertEquals(3500.00, funcionario.getSalario(), 0.01);

        try {
            funcionario.setSalario(-1000.00);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        assertEquals(0, funcionario.calcularBonus(), 0.01);
        funcionario.trabalhar();
    }

    @Test
    public void testGerente() {
        Gerente gerente = new Gerente("Liziane", 5000.00);
        assertEquals("Liziane", gerente.getNome());
        assertEquals(5000.00, gerente.getSalario(), 0.01);

        gerente.setNome("Liziane");
        assertEquals("Liziane", gerente.getNome());

        gerente.setSalario(5500.00);
        assertEquals(5500.00, gerente.getSalario(), 0.01);

        try {
            gerente.setSalario(-2000.00);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        assertEquals(1100.00, gerente.calcularBonus(), 0.01);
        gerente.trabalhar();
    }

    @Test
    public void testDesenvolvedor() {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bob", 4000.00);
        assertEquals("Bob", desenvolvedor.getNome());
        assertEquals(4000.00, desenvolvedor.getSalario(), 0.01);

        desenvolvedor.setNome("Liziane");
        assertEquals("Liziane", desenvolvedor.getNome());

        desenvolvedor.setSalario(4500.00);
        assertEquals(4500.00, desenvolvedor.getSalario(), 0.01);

        try {
            desenvolvedor.setSalario(-1500.00);
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }

        assertEquals(450.00, desenvolvedor.calcularBonus(), 0.01);
        desenvolvedor.trabalhar();
    }
}