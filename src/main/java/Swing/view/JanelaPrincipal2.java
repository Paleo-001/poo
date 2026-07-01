/*
 * Created by JFormDesigner on Tue Jun 30 19:21:37 GMT-03:00 2026
 */

package Swing.view;

import java.awt.*;
import javax.swing.*;

/**
 * @author carlos
 */
public class JanelaPrincipal2 extends JPanel {
    public JanelaPrincipal2() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Carlos Fernando Paleo da Rocha
        txtItem = new JTextField();
        btnIncluir = new JButton();
        scrollPane1 = new JScrollPane();
        lstLista = new JList();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());
        add(txtItem, BorderLayout.NORTH);

        //---- btnIncluir ----
        btnIncluir.setText("Incluir Item");
        add(btnIncluir, BorderLayout.SOUTH);
    /*
    Os temas avaliados incluem:
        • encapsulamento;
        • herança;
        • polimorfismo;
        • interfaces e classes abstratas;
        • padrões de projeto (Singleton, Factory, Builder, Strategy, Observer e Composite);
        • princípios SOLID;
     */
        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(lstLista);
        }
        add(scrollPane1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Carlos Fernando Paleo da Rocha
    private JTextField txtItem;
    private JButton btnIncluir;
    private JScrollPane scrollPane1;
    private JList lstLista;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
