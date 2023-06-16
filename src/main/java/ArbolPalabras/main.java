package ArbolPalabras;

import javax.swing.*;
import java.awt.*;


public class main {

    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Interfaz con GroupLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        JLabel etiqueta1 = new JLabel("Nombre:");
        JLabel etiqueta2 = new JLabel("Edad:");
        JTextField campoTexto1 = new JTextField(20);
        JTextField campoTexto2 = new JTextField(20);

        // Crear el GroupLayout y asignarlo al contenedor principal
        Container contenedor = ventana.getContentPane();
        GroupLayout layout = new GroupLayout(contenedor);
        contenedor.setLayout(layout);

        // Configurar el GroupLayout
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Definir las relaciones entre componentes
        GroupLayout.SequentialGroup grupoHorizontal = layout.createSequentialGroup();
        grupoHorizontal.addGroup(layout.createParallelGroup()
                .addComponent(etiqueta1)
                .addComponent(etiqueta2));
        grupoHorizontal.addGroup(layout.createParallelGroup()
                .addComponent(campoTexto1)
                .addComponent(campoTexto2));
        layout.setHorizontalGroup(grupoHorizontal);

        GroupLayout.SequentialGroup grupoVertical = layout.createSequentialGroup();
        grupoVertical.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(etiqueta1)
                .addComponent(campoTexto1));
        grupoVertical.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(etiqueta2)
                .addComponent(campoTexto2));
        layout.setVerticalGroup(grupoVertical);

        // Mostrar la ventana
        ventana.pack();
        ventana.setVisible(true);
    }
}

