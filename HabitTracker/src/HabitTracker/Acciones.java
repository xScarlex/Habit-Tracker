package HabitTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acciones extends JFrame {

    private JTextField CamaYVitam;
    private JTextField Stretch;
    private JTextField Leer;
    private JTextField Recoger;
    private JTextField Teorico;
    private JTextField Practico;
    private JTextField Deporte;
    private JTextField CafeAlc;
    private JTextField Dia;
    private JTextField Mes;
    private JTextField Anio;
    private JButton botonMostrar;

    public Acciones() {
    	
    }
    
    public void menuInicial() {
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400); // Cambié el tamaño para hacerlo más manejable
        setLocationRelativeTo(null);
        setLayout(new GridLayout(12, 2)); // Cambié el GridLayout para adaptarlo a todos los campos

        JLabel labelCamaYVitam = new JLabel("Cama y vitaminas: ");
        CamaYVitam = new JTextField();
        JLabel labelStretch = new JLabel("Stretch: ");
        Stretch = new JTextField();
        JLabel labelLeer = new JLabel("Leer (30 mins): ");
        Leer = new JTextField();
        JLabel labelRecoger = new JLabel("Recoger: ");
        Recoger = new JTextField();
        JLabel labelEstudioTeorico = new JLabel("Estudio teorico: ");
        Teorico = new JTextField();
        JLabel labelEstudioPractico = new JLabel("Estudio practico: ");
        Practico = new JTextField();
        JLabel labelDeporte = new JLabel("Deporte: ");
        Deporte = new JTextField();
        JLabel labelCafeYAlc = new JLabel("Café y alcohol: ");
        CafeAlc = new JTextField();
        JLabel labelDia = new JLabel("Día: ");
        Dia = new JTextField();
        JLabel labelMes = new JLabel("Mes: ");
        Mes = new JTextField();
        JLabel labelAnio = new JLabel("Año: ");
        Anio = new JTextField();

        botonMostrar = new JButton("Mostrar");

        botonMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });

        add(labelCamaYVitam);
        add(CamaYVitam);
        add(labelStretch);
        add(Stretch);
        add(labelLeer);
        add(Leer);
        add(labelRecoger);
        add(Recoger);
        add(labelEstudioTeorico);
        add(Teorico);
        add(labelEstudioPractico);
        add(Practico);
        add(labelDeporte);
        add(Deporte);
        add(labelCafeYAlc);
        add(CafeAlc);
        add(labelDia);
        add(Dia);
        add(labelMes);
        add(Mes);
        add(labelAnio);
        add(Anio);
        add(botonMostrar);

        setVisible(true);
    }

    public void mostrarDatos() {
        String camaYVitam = CamaYVitam.getText();
        String stretch = Stretch.getText();
        String leer = Leer.getText();
        String recoger = Recoger.getText();
        String teorico = Teorico.getText();
        String practico = Practico.getText();
        String deporte = Deporte.getText();
        String cafeAlc = CafeAlc.getText();
        String dia = Dia.getText();
        String mes = Mes.getText();
        String anio = Anio.getText();

        JOptionPane.showMessageDialog(this, "Cama y vitaminas: " + camaYVitam +
                                            "\nStretch: " + stretch +
                                            "\nLeer (30 mins): " + leer +
                                            "\nRecoger: " + recoger +
                                            "\nEstudio teorico: " + teorico +
                                            "\nEstudio practico: " + practico +
                                            "\nDeporte: " + deporte +
                                            "\nCafé y alcohol: " + cafeAlc +
                                            "\nDía: " + dia +
                                            "\nMes: " + mes +
                                            "\nAño: " + anio);
    }
}