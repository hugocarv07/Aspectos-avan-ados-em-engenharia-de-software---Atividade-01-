package padroesprojeto.factorymethod.seguros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinistroAutomovelTest {

    @Test
    void deveProcessarSinistroAutomovel() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Automovel");
        assertEquals("Sinistro de automóvel processado", sinistro.processar());
    }

    @Test
    void deveRecusarSinistroAutomovel() {
        ISinistro sinistro = SinistroFactory.obterSinistro("Automovel");
        assertEquals("Sinistro de automóvel recusado", sinistro.recusar());
    }
}
