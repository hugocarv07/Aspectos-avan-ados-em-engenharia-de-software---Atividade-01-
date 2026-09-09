package padroesprojeto.factorymethod.seguros;

public class SinistroFactory {

    public static ISinistro obterSinistro(String tipo) {
        try {
            Class<?> classe = Class.forName(
                    "padroesprojeto.factorymethod.seguros.Sinistro" + tipo);
            Object objeto = classe.getDeclaredConstructor().newInstance();
            return (ISinistro) objeto;
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Sinistro inexistente");
        } catch (Exception e) {
            throw new IllegalArgumentException("Sinistro inválido");
        }
    }
}
