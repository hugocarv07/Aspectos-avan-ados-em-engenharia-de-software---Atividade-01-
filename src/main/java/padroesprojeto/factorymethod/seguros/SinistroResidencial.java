package padroesprojeto.factorymethod.seguros;

public class SinistroResidencial implements ISinistro {

    @Override
    public String processar() {
        return "Sinistro residencial processado";
    }

    @Override
    public String recusar() {
        return "Sinistro residencial recusado";
    }
}
