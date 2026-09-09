package padroesprojeto.factorymethod.seguros;

public class SinistroVida implements ISinistro {

    @Override
    public String processar() {
        return "Sinistro de vida processado";
    }

    @Override
    public String recusar() {
        return "Sinistro de vida recusado";
    }
}
