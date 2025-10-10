import javax.swing.*;      // Librería Swing para componentes GUI
import java.awt.*;         // Librería AWT para elementos visuales básicos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {

    public static void main(String[] args) {
        // Ejecutar la creación de la GUI en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        // Crear la ventana principal (JFrame)
        JFrame ventana = new JFrame("My first GUI window");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.getContentPane().setBackground(Color.PINK);

        // Crear una etiqueta de texto centrada
        JLabel etiqueta = new JLabel("Hello GUI World with Swing (CENTER)", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);

        etiqueta = new JLabel("Trying the TOP (PAGE_START)", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.ITALIC, 16));
        ventana.getContentPane().add(etiqueta, BorderLayout.PAGE_START);

         etiqueta = new JLabel("Trying the bottom (PAGE_END)", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.ITALIC, 16));
        ventana.getContentPane().add(etiqueta, BorderLayout.SOUTH);

        JButton button = new JButton("Change window");
        JButton button3 = new JButton("Change color");
        button3.setBackground(Color.ORANGE);
        ventana.add(button, BorderLayout.PAGE_START );
        ventana.add(button3, BorderLayout.SOUTH);


        // Ventana 2

        JFrame ventana2 = new JFrame("My Second first GUI window");
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setSize(400, 200);
        ventana2.getContentPane().setBackground(Color.GRAY);


        etiqueta = new JLabel("This is the second window", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        ventana2.getContentPane().add(etiqueta, BorderLayout.CENTER);
        JButton button2 = new JButton("Change window");
        ventana2.add(button2, BorderLayout.PAGE_START );
        ventana2.setLocation(800,400);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(false);
                ventana2.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.setVisible(true);
                ventana2.setVisible(false);
            }
        });





        // Cambio de colores con acción en el botón
        button3.addActionListener(new ActionListener() {
            boolean isColorChanged = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isColorChanged){
                    ventana.getContentPane().setBackground(Color.ORANGE);
                    button3.setBackground(Color.PINK);
                    isColorChanged =true;
                } else {
                    ventana.getContentPane().setBackground(Color.PINK);
                    button3.setBackground(Color.ORANGE);
                    isColorChanged =false;
                }

            }
        });




        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);

        System.out.println("La ventana GUI debería estar visible.");
    }
}
