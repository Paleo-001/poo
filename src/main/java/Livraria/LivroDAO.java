package Livraria;

import java.sql.*;
import java.util.*;

public class LivroDAO {
    public void inserir(Livro livro){
        String sql = "INSERT INTO livros (titulo,autor,ano) VALUES (?,?,?)";


        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3,livro.getAno());
            stmt.executeUpdate();
            System.out.println("Livro inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro no banco!");
        }
    }

    public List<Livro> listarTodos(){
        List<Livro> lista = new ArrayList<>();
        String sql = "SELECT * FROM livros";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                Livro l = new Livro(
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getInt("ano")
                );
                l.setId(rs.getInt("id"));
                lista.add(l);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar os livros!");
        }
        return lista;
    }
}
