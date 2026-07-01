package ListaCompras.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {
    private static ConectaBD instancia;
    private Connection minhaConexao;

    private ConectaBD() {
        try {
            this.minhaConexao = DriverManager.getConnection("jdbc:sqlite:lista_compras.db");
        } catch(SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco!", e);
        }
    }

    public static synchronized ConectaBD getInstance(){
        if(instancia == null){
            instancia = new ConectaBD();
        }
        return instancia;
    }

    public Connection getMinhaConexao() {
        return minhaConexao;
    }
}
