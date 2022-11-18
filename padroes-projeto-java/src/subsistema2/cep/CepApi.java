package subsistema2.cep;

import one.digitalinnovation.gof.singleton.EagerSingleton;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Recife";
    }
    public String recuperarEstado(String cep){
        return "Pernambuco";
    }
}