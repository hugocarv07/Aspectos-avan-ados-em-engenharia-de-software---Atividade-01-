package padroesprojeto.factorymethod.seguros;

/**
 * Produto abstrato do padrão Factory Method.
 * Toda apólice de seguro que pode gerar um sinistro processável
 * deve implementar este contrato.
 */
public interface ISinistro {

    String processar();

    String recusar();
}
