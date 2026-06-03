package Singleton;

public class Configuracao {
    private static Configuracao instanciaUnica;
    private Configuracao(){
        System.out.println("Configurações carregadas!");
    }
    public static Configuracao getInstance(){
        if (instanciaUnica == null){
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }
}
