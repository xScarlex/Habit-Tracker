package HabitTracker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acciones extends JFrame { 

    private JTextField nombreField;
    private JTextField edadField;
    private JButton botonMostrar;

    public Acciones() {
        
    }
    
    public void menuInicial() {
    	setTitle("Menú"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField();
        botonMostrar = new JButton("Mostrar");

        botonMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });

        add(nombreLabel);
        add(nombreField);
        add(edadLabel);
        add(edadField);
        add(botonMostrar);
        setVisible(true);
    }

    public void mostrarDatos() {
        String nombre = nombreField.getText();
        String edad = edadField.getText();
        JOptionPane.showMessageDialog(this, "Nombre: " + nombre + "\nEdad: " + edad);
    }
}
