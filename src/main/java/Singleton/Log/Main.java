package Singleton.Log;

public class Main {
    public static void main(String[] args){
        Logger meuLog = Logger.getInstance();
        meuLog.log("Usuário logou no sistema.");
        Logger teuLog = Logger.getInstance();
        System.out.println(meuLog == teuLog);
    }
}
