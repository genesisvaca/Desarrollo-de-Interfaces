import javax.swing.*;      // Librería Swing para componentes GUI
import java.awt.*;         // Librería AWT para elementos visuales básicos

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


        JLabel etiqueta1 = new JLabel("Trying the TOP (PAGE_START)", SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", Font.ITALIC, 16));
        JLabel etiqueta2 = new JLabel("Trying the bottom (PAGE_END)", SwingConstants.CENTER);
        etiqueta2.setFont(new Font("Arial", Font.ITALIC, 16));

        // Añadir la etiqueta al contenido de la ventana, centrada
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);
        ventana.getContentPane().add(etiqueta1, BorderLayout.PAGE_START);
        ventana.getContentPane().add(etiqueta2, BorderLayout.SOUTH);

        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);

        System.out.println("La ventana GUI debería estar visible.");
    }
}
