package ListaCompras.dao;

import ListaCompras.modelo.ListaPrecos;

import java.util.List;

public interface PrecosDAO {
    void incluir(int item, int mercado, double preco);
    void atualizar(int id, int item, int mercado, double preco);
    void excluir(int id);
    List<ListaPrecos> listarPrecos();
}
