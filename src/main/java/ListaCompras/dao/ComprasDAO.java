package ListaCompras.dao;

import ListaCompras.modelo.Compras;

import java.util.List;

public interface ComprasDAO {
    void Comprar(String data, int mercado, int item, double preco);
    List<Compras> listarCompra();
}
