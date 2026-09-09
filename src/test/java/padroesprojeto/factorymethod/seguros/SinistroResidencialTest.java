package padroesprojeto.factorymethod.seguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinistroResidencialTest {

    @Test
    void deveProcessarSinistroResidencial() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Residencial");
        assertEquals("Sinistro residencial processado", sinistro.processar());
    }

    @Test
    void deveRecusarSinistroResidencial() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Residencial");
        assertEquals("Sinistro residencial recusado", sinistro.recusar());
    }
}
