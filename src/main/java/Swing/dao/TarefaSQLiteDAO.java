package Swing.dao;

import Swing.model.Tarefa;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TarefaSQLiteDAO implements TarefaDAO {
    private Connection conexao;
    public TarefaSQLiteDAO() throws SQLException{
        conexao = DriverManager.getConnection("jdbc:sqlite:tarefas.db");
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE TABLE IF NOT EXISTS tarefas (id INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT)");
    }

    @Override
    public void salvar(String descricao) {
        String sql = "INSERT INTO tarefas(descricao) VALUES (?)";
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setString(1,descricao);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Tarefa> listarTodas() {
        List<Tarefa> lista = new ArrayList<>();
        try(ResultSet rs = conexao.createStatement().executeQuery("SELECT * FROM tarefas")){
            while (rs.next()){
                lista.add(new Tarefa(rs.getInt("id"),rs.getString("descricao")));
            }
            Collections.sort(lista, Comparator.comparing(Tarefa::getDescricao));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
