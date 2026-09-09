package padroesprojeto.factorymethod.seguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class SinistroFactoryTest {

    @Test
    void deveRetornarExcecaoParaSinistroInexistente() {
        try {
            ISinistro sinistro = SinistroFactory.obterSinistro("Roubo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sinistro inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSinistroInvalido() {
        try {
            ISinistro sinistro = SinistroFactory.obterSinistro("Fraude");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sinistro inválido", e.getMessage());
        }
    }
}
