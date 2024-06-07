package vista_;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import controlador_.Controlador;
import modelo_.Opciones;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
// VistaGUI, extiende JFrame e implementa la interfaz de Vista. Crea una GUI para el Piedra, Papel o Tijera.
public class VistaGUI extends JFrame implements Vista{
    //Contiene varios objetos JPanel, JLabel e Icon que se utilizan para crear los elementos visuales del juego.
    Container contenedor;
    GridLayout layoutPrincipal, layoutTop, layoutBottom;
    JPanel topPanel, bottomPanel, top1, top2, bottom1, bottom2, bottom3;
    public static Icon piedraIcon = new ImageIcon(new ImageIcon("Game/src/vista_/options/Piedra.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon papelIcon = new ImageIcon(new ImageIcon("Game/src/vista_/options/Papel.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    public static Icon tijerasIcon =new ImageIcon(new ImageIcon("Game/src/vista_/options/Tijeras.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    Icon piedraRivalIcon = new ImageIcon(new ImageIcon("Game/src/vista_/options/PiedraRival.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    Icon papelRivalIcon = new ImageIcon(new ImageIcon("Game/src/vista_/options/PapelRival.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
    Icon tijerasRivalIcon = new ImageIcon(new ImageIcon("Game/src/vista_/options/TijerasRival.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));


    public static JLabel piedra = new JLabel(piedraIcon);
    public static JLabel papel = new JLabel(papelIcon);
    public static JLabel tijeras = new JLabel(tijerasIcon);
    public static Opciones opciongui;
    JLabel ladousuario = new JLabel("Usuario:");
    JLabel usuario = new JLabel();
    JLabel ladomaquina = new JLabel("Botsito:");
    JLabel maquina = new JLabel();

    public VistaGUI(){
        //Se organiza cada elemento visual para obtener la mejor estética posible.
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
        top1.setLayout(new BoxLayout(top1, BoxLayout.Y_AXIS));
        top2.setLayout(new BoxLayout(top2, BoxLayout.Y_AXIS));

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

        top1.add(ladousuario);
        top2.add(ladomaquina);
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
        setLocationRelativeTo(null);

    }
    //Métodos mostrarOpcionUsuario, mostrarOpcionMaquina y mostrarPuntuacion
    //se utilizan para actualizar la GUI con la elección del usuario, de la máquina y la puntuación, respectivamente.
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
            maquina.setIcon(piedraRivalIcon);
    }else if(opcion == Opciones.PAPEL){
        maquina.setIcon(papelRivalIcon);
    }else if(opcion == Opciones.TIJERA){
        maquina.setIcon(tijerasRivalIcon);
    }
    }

    @Override
    public void mostrarPuntuacion(int puntosUsuario, int puntosMaquina) {
        JOptionPane.showMessageDialog(contenedor, "Puntuación: Usuario: " + puntosUsuario + " - Máquina: " + puntosMaquina, "resultado", 1);
    }
    //El método obtenerOpcionUsuario se usa para obtener la elección del usuario.
    @Override
    public Opciones obtenerOpcionUsuario() {
        return opciongui;
    }
    //Método mostrarVista se usa para mostrar la GUI y agregar listeners del mouse a los objetos JLabel del juego.
    @Override
    public void mostrarVista(Controlador controlador) {
        setVisible(true);
        piedra.addMouseListener(controlador);  
        papel.addMouseListener(controlador);
        tijeras.addMouseListener(controlador);

    }
    
}
