package ListaCompras.dao;

import ListaCompras.modelo.Itens;

import java.util.List;

public interface ItensDAO {
    void adicionar(String nome, int quantidade);
    List<Itens> listarItens();
    void excluir(int id);
    void atualizar(int id, String nome, int quantidade);
}
