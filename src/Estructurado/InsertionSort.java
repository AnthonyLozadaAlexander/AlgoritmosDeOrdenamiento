/*
 * Created by JFormDesigner on Sun Nov 02 13:04:37 ECT 2025
 */

package Estructurado;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * @author USUARIO
 */
public class InsertionSort extends JFrame {
    public InsertionSort() {
        initComponents();
        setTitle("Insertion Sort");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void btnCrearVector(ActionEvent e) {
        int tamano = Integer.parseInt(txtNums.getText());;

        if(tamano == 0 || txtNums.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe Ingresar Un Tamaño Valido", "Error: Crear Vector",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(tamano < 0 || tamano > 10){
            JOptionPane.showMessageDialog(this, "El tamano del vector no puede ser negativo, ni mayor a 10", "Error: " +
                            "Crear Vector",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        label1 = new JLabel();
        label2 = new JLabel();
        txtTamano = new JTextField();
        label3 = new JLabel();
        txtElementos = new JTextField();
        btnIngresar = new JButton();
        scrollPane1 = new JScrollPane();
        txtDatos = new JTextArea();
        btnOrdenar = new JButton();
        scrollPane2 = new JScrollPane();
        txtResultados = new JTextArea();
        btnCrearVector = new JButton();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Ordenamiento Insertion Sort");
        label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
        label1.setName("label1");

        //---- label2 ----
        label2.setText("N:");
        label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
        label2.setName("label2");

        //---- txtTamano ----
        txtTamano.setName("txtTamano");

        //---- label3 ----
        label3.setText("Ingresar Elementos:");
        label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
        label3.setName("label3");

        //---- txtElementos ----
        txtElementos.setName("txtElementos");

        //---- btnIngresar ----
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
        btnIngresar.setName("btnIngresar");

        //======== scrollPane1 ========
        {
            scrollPane1.setName("scrollPane1");

            //---- txtDatos ----
            txtDatos.setName("txtDatos");
            scrollPane1.setViewportView(txtDatos);
        }

        //---- btnOrdenar ----
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
        btnOrdenar.setName("btnOrdenar");

        //======== scrollPane2 ========
        {
            scrollPane2.setName("scrollPane2");

            //---- txtResultados ----
            txtResultados.setName("txtResultados");
            scrollPane2.setViewportView(txtResultados);
        }

        //---- btnCrearVector ----
        btnCrearVector.setText("Crear Vector");
        btnCrearVector.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
        btnCrearVector.setName("btnCrearVector");
        btnCrearVector.addActionListener(e -> btnCrearVector(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addComponent(btnIngresar))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label3)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(txtElementos, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(label2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(btnCrearVector)
                                        .addComponent(txtTamano, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))))
                            .addGap(83, 83, 83)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(btnOrdenar))
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, GroupLayout.Alignment.LEADING)))
                    .addContainerGap(51, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTamano, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(18, 18, 18)
                            .addComponent(btnCrearVector)
                            .addGap(27, 27, 27)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtElementos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnIngresar))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(btnOrdenar)
                    .addGap(71, 71, 71))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public static void main(String[] args) {
        // Aplicar tema IntelliJ Light
        try {
            UIManager.setLookAndFeel("com.intellij.ide.ui.laf.IntelliJLaf");
        } catch (Exception e) {
            // Si no está disponible, usar el tema del sistema
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        java.awt.EventQueue.invokeLater(() -> {
            new InsertionSort().setVisible(true);
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JLabel label1;
    private JLabel label2;
    private JTextField txtTamano;
    private JLabel label3;
    private JTextField txtElementos;
    private JButton btnIngresar;
    private JScrollPane scrollPane1;
    private JTextArea txtDatos;
    private JButton btnOrdenar;
    private JScrollPane scrollPane2;
    private JTextArea txtResultados;
    private JButton btnCrearVector;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
