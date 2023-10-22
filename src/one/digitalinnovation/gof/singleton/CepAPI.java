package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author CassioFerreiraRod
 */
public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }
}