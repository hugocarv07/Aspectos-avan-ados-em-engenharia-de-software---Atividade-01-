package padroesprojeto.factorymethod.seguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinistroVidaTest {

    @Test
    void deveProcessarSinistroVida() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Vida");
        assertEquals("Sinistro de vida processado", sinistro.processar());
    }

    @Test
    void deveRecusarSinistroVida() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Vida");
        assertEquals("Sinistro de vida recusado", sinistro.recusar());
    }
}
