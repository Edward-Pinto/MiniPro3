package Vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Controlador.Controlador;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;

import Modelo.Opciones;

public class VistaGUI extends JFrame implements Vista{

    Container contenedor;
    GridLayout layoutPrincipal, layoutTop, layoutBottom;
    JPanel topPanel, bottomPanel, top1, top2, bottom1, bottom2, bottom3;

    public VistaGUI(){
        contenedor = getContentPane();
        layoutPrincipal = new GridLayout(2,1);
        contenedor.setLayout(layoutPrincipal);
        Border lineBorder = new LineBorder(Color.BLACK, 2);

        JLabel piedra = new JLabel(new ImageIcon(new ImageIcon("src/Vista/Opciones/Piedra.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        JLabel papel = new JLabel(new ImageIcon(new ImageIcon("src/Vista/Opciones/Papel.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        JLabel tijeras = new JLabel(new ImageIcon(new ImageIcon("src/Vista/Opciones/Tijeras.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));


        topPanel = new JPanel();
        layoutTop = new GridLayout(1,2);
        topPanel.setLayout(layoutTop);        
        bottomPanel = new JPanel();
        layoutBottom = new GridLayout(1,3);
        bottomPanel.setLayout(layoutBottom);

        top1 = new JPanel();
        top2 = new JPanel();
        bottom1 = new JPanel();
        bottom2 = new JPanel();
        bottom3 = new JPanel();

        top1.setBackground(Color.GRAY);
        top2.setBackground(Color.GRAY);

        bottom1.setBackground(Color.GRAY);
        bottom2.setBackground(Color.GRAY);
        bottom3.setBackground(Color.GRAY);

        top1.setBorder(lineBorder);
        top2.setBorder(lineBorder);
        bottom1.setBorder(lineBorder);
        bottom2.setBorder(lineBorder);
        bottom3.setBorder(lineBorder);

        bottom1.add(piedra);
        bottom2.add(papel);
        bottom3.add(tijeras);

        topPanel.setBorder(lineBorder);
        bottomPanel.setBorder(lineBorder);

        topPanel.add(top1);
        topPanel.add(top2);
        bottomPanel.add(bottom1);
        bottomPanel.add(bottom2);
        bottomPanel.add(bottom3);

        contenedor.add(topPanel);
        contenedor.add(bottomPanel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);
        setTitle("ULTIMATE PIEDRA, PAPEL ,TIJERA");
        setResizable(false);

    }

    @Override
    public void mostrarOpcionUsuario(Opciones opcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarOpcionUsuario'");
    }

    @Override
    public void mostrarOpcionMaquina(Opciones opcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarOpcionMaquina'");
    }


    @Override
    public void mostrarResultado(String resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResultado'");
    }


    @Override
    public void mostrarPuntuacion(int puntosUsuario, int puntosMaquina) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarPuntuacion'");
    }

    @Override
    public Opciones obtenerOpcionUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerOpcionUsuario'");
    }

    @Override
    public void mostrarVista(Controlador controlador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarVista'");
    }
    
}
