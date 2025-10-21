package edu.thepower.desarrollointerfaces.u1;
/**
 *  Crear un formulario son Swing que pida Nombre, Apellidos, Dirección y Teléfono
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    // JTextField (Campos de texto)
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtTelefono;

    // JButton (Botones)
    private JButton btnGuardar;
    private JButton btnBorrar;


    public Form1(){

        // setTitle (Titulo de la venta)
        setTitle("Formulario de Registro");

        // setDefaultCloseOperation (Cerrar al salir)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setSize (Tamaño de la ventana)
        setSize(400,300);

        // setLocationRelativeTo (Centrar en la pantalla)
        setLocationRelativeTo(null);

        // BorderLayout (Crear panel para poner el titulo en el NORTH)
        JPanel mainPanel = new JPanel(new BorderLayout());

        // JLabel (Crear el título que aparecerá en ventana en NORTH)
        JLabel lblTitulo = new JLabel("FORMULARIO",SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20,0,25,0));
        mainPanel.add(lblTitulo, BorderLayout.NORTH);


        // JPanel (Crear panel principal con layout de cuadrícula
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        // new Label (crear etiquetas) || new JTextField (crear campos)
        panel.add(new Label("Nombre:"));
        txtNombre = new JTextField();
        panel.add(txtNombre);

        panel.add(new Label("Apellidos:"));
        txtApellidos = new JTextField();
        panel.add(txtApellidos);

        panel.add(new Label("Dirección:"));
        txtDireccion = new JTextField();
        panel.add(txtDireccion);

        panel.add(new Label("Teléfono:"));
        txtTelefono = new JTextField();
        panel.add(txtTelefono);

        // new JButton (crear etiquetas botones)
        btnGuardar = new JButton("Guardar");
        btnBorrar = new JButton("Borrar");

        // .add (Añadir botones a la ventana)
        panel.add(btnGuardar);
        panel.add(btnBorrar);

        // .add (Añadir el panel de campos al centro del mainPanel)
        mainPanel.add(panel, BorderLayout.CENTER);

        // add (Añadir mainPanel a la ventana)
        add(mainPanel);

        // .addActionListener (Añadir acción del botón guardar)
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellidos = txtApellidos.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();

                // JOptionPane.showMessageDialog (Muestra los datos introducidos en un cuadro)
                JOptionPane.showMessageDialog(
                        Form1.this,
                        "Formulario registrado: \n" +
                                "Nombre: " + nombre + "\n" +
                                "Apellido: " + apellidos + "\n" +
                                "Dirección: " + direccion + "\n" +
                                "Teléfono: " + telefono + "\n" +
                                JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // .addActionListener (Añadir acción del botón Borrar
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtApellidos.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            Form1 form1 = new Form1();
            form1.setVisible(true);
        });
    }
}
