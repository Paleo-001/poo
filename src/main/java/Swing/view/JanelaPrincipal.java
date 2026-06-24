package Swing.view;

import Swing.dao.TarefaDAO;
import Swing.dao.TarefaSQLiteDAO;
import Swing.model.Tarefa;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class JanelaPrincipal extends JFrame {
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private TarefaDAO dao;
    public JanelaPrincipal(){
        try {
            dao = new TarefaSQLiteDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setTitle("Lista de Compras");
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField campo = new JTextField();
        JButton btnAdd = new JButton("Adicionar");
        JList<String> lista = new JList<>(modeloLista);

        btnAdd.addActionListener(e -> {
            dao.salvar(campo.getText());
            atualizarLista();
            campo.setText("");
        });

        add(campo, BorderLayout.NORTH);
        add(new JScrollPane(lista),BorderLayout.CENTER);
        add(btnAdd,BorderLayout.SOUTH);
        atualizarLista();
    }

    public void atualizarLista(){
        modeloLista.clear();
        for (Tarefa t : dao.listarTodas()){
            modeloLista.addElement(t.getDescricao());
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new JanelaPrincipal().setVisible(true));
    }
}
