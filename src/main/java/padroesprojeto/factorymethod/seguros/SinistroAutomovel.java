package padroesprojeto.factorymethod.seguros;

public class SinistroAutomovel implements ISinistro {

    @Override
    public String processar() {
        return "Sinistro de automóvel processado";
    }

    @Override
    public String recusar() {
        return "Sinistro de automóvel recusado";
    }
}
