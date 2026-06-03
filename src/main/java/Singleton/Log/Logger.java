package Singleton.Log;

public class Logger {
    /*
    Crie uma classe chamada Logger utilizando o padrão Singleton. Ela deve ter um método log(String mensagem) que apenas imprime a mensagem na tela. Em seguida, chame ela de uma classe main.
     */
    private static Logger instancia;
    private Logger(){}
    public static Logger getInstance(){
        if (instancia == null){
            instancia = new Logger();
        }
        return instancia;
    }
    public void log(String mensagem){
        System.out.println("[LOG]: " + mensagem);
    }
}
