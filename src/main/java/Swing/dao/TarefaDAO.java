package Swing.dao;

import Swing.model.Tarefa;

import java.util.List;

public interface TarefaDAO {
    void salvar(String descricao);
    List<Tarefa> listarTodas();
}
