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
        JFrame ventana = new JFrame("Mi Primera Ventana GUI");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);

        // Crear una etiqueta de texto centrada
        JLabel etiqueta = new JLabel("Hola Mundo GUI con Swing", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));

        // Añadir la etiqueta al contenido de la ventana, centrada
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);

        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);

        System.out.println("La ventana GUI debería estar visible.");
    }
}
