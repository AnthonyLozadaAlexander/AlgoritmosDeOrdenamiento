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
    int [] vectorNums;
    String regex =  "^\\d+(\\.\\d+)?$";
    int count;

    public InsertionSort() {
        initComponents();
        setTitle("Insertion Sort");
        setLocationRelativeTo(null);
        setResizable(false);
        btnIngresar.setEnabled(false);
        btnOrdenar.setEnabled(false);
    }

    public void isEmpty(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == 0){
                JOptionPane.showMessageDialog(this, "El Vector no se encuentra lleno", "Error: Vector Incompleto",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    public int insertionSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int valorActual = vector[i];
            int j = i - 1;
            while(j >= 0 && vector[j] > valorActual){
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = valorActual;
            return valorActual;
        }

        return 0;
    }


    private void btnCrearVector(ActionEvent e) {

        if(vectorNums != null){
            JOptionPane.showMessageDialog(this, "El Vector Ya Se Encuentra Creado", "Error: Crear Vector",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!txtTamano.getText().matches(regex)){
            JOptionPane.showMessageDialog(this, "Error: Debe Ingresar Un Numero Valido", "Error: FormatoInvalido",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int tamano = Integer.parseInt(txtTamano.getText());;

        if(tamano == 0 || txtTamano.getText().trim().isEmpty()){
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

        vectorNums = new int[tamano];
        JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente\n" +
                        "vectorNums["+vectorNums.length+"]","Crear Vector", JOptionPane.INFORMATION_MESSAGE);

        txtDatos.append("Vector["+tamano+"] Creado Exitosamente\n");
        btnIngresar.setEnabled(true);

    }

    private void btnIngresar(ActionEvent e) {

        if(count >= vectorNums.length){
            JOptionPane.showMessageDialog(this, "El vector ya se encuentra lleno", "Error: Ingresar Elemento",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(txtElementos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe Ingresar Un Elemento", "Error: Ingresar Elemento",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(!txtElementos.getText().matches(regex)){
            JOptionPane.showMessageDialog(this, "Error: Debe Ingresar Un Numero Valido", "Error: FormatoInvalido",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

       int element = Integer.parseInt(txtElementos.getText());
       vectorNums[count] = element;
       txtDatos.append("Vector["+count+"] = " + element + "\n");
       count++;
    }

    private void btnOrdenar(ActionEvent e) {
        isEmpty(vectorNums);

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
        btnIngresar.addActionListener(e -> btnIngresar(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setName("scrollPane1");

            //---- txtDatos ----
            txtDatos.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 12));
            txtDatos.setName("txtDatos");
            scrollPane1.setViewportView(txtDatos);
        }

        //---- btnOrdenar ----
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
        btnOrdenar.setName("btnOrdenar");
        btnOrdenar.addActionListener(e -> btnOrdenar(e));

        //======== scrollPane2 ========
        {
            scrollPane2.setName("scrollPane2");

            //---- txtResultados ----
            txtResultados.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 12));
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
                    .addGroup(contentPaneLayout.createParallelGroup()
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
                                                .addComponent(txtTamano, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                    .addComponent(btnCrearVector)
                                                    .addGap(14, 14, 14)))))
                                    .addGap(42, 42, 42)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(btnOrdenar)))
                    .addContainerGap(34, Short.MAX_VALUE))
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
                    .addGap(31, 31, 31)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnOrdenar)
                    .addContainerGap(90, Short.MAX_VALUE))
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
