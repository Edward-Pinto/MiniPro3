package vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import controlador.Controlador;
import modelo.Opciones;

public class VistaGUI extends JFrame implements Vista{

    Container contenedor;
    GridLayout layoutPrincipal, layoutTop, layoutBottom;
    JPanel topPanel, bottomPanel, top1, top2, bottom1, bottom2, bottom3;
    public static Icon piedraIcon = new ImageIcon(new ImageIcon("src/Vista/options/Piedra.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon papelIcon = new ImageIcon(new ImageIcon("src/Vista/options/Papel.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon tijerasIcon =new ImageIcon(new ImageIcon("src/Vista/options/Tijeras.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    
    public static JLabel piedra = new JLabel(piedraIcon);
    public static JLabel papel = new JLabel(papelIcon);
    public static JLabel tijeras = new JLabel(tijerasIcon);
    public static Opciones opciongui;

    JLabel usuario = new JLabel();
    JLabel maquina = new JLabel();

    public VistaGUI(){
        contenedor = getContentPane();
        layoutPrincipal = new GridLayout(2,1);
        contenedor.setLayout(layoutPrincipal);
        Border lineBorder = new LineBorder(Color.BLACK, 2);

        
        

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


        top1.add(usuario);
        top2.add(maquina);
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
        setTitle("ULTIMATE PIEDRA, PAPEL ,TIJERA");
        setResizable(false);

    }

    @Override
    public void mostrarOpcionUsuario(Opciones opcion) {
        if(opcion == Opciones.PIEDRA){
            usuario.setIcon(piedraIcon);
        }else if(opcion == Opciones.PAPEL){
            usuario.setIcon(papelIcon);
        }else if(opcion == Opciones.TIJERA){
            usuario.setIcon(tijerasIcon);
        }
    }

    @Override
    public void mostrarOpcionMaquina(Opciones opcion) {        
        if(opcion == Opciones.PIEDRA){
            maquina.setIcon(piedraIcon);
    }else if(opcion == Opciones.PAPEL){
        maquina.setIcon(papelIcon);
    }else if(opcion == Opciones.TIJERA){
        maquina.setIcon(tijerasIcon);
    }
    }





    @Override
    public void mostrarPuntuacion(int puntosUsuario, int puntosMaquina) {
        JOptionPane.showMessageDialog(null, "Puntuación: Usuario: " + puntosUsuario + " - Máquina: " + puntosMaquina, "resultado", 1);
    }

    @Override
    public Opciones obtenerOpcionUsuario() {
        return opciongui;
    }

    @Override
    public void mostrarVista(Controlador controlador) {
        setVisible(true);
        piedra.addMouseListener(controlador);  
        papel.addMouseListener(controlador);
        tijeras.addMouseListener(controlador);

    }
    
}
