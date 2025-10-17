package edu.thepower.desarrollointerfaces.u1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {

    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtTelefono;

    private JButton btnGuardar;
    private JButton btnBorrar;

    public Form1(){

        setTitle("Formulario de Registro");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,300);

        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

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

        btnGuardar = new JButton("Guardar");
        btnBorrar = new JButton("Borrar");

        panel.add(btnGuardar);
        panel.add(btnBorrar);

        add(panel);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String apellidos = txtApellidos.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();

                JOptionPane.showMessageDialog(
                        Form1.this,
                        "Formulario registrado: \n"
                );
            }
        });



    }

}
