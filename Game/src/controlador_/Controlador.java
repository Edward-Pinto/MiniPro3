package controlador_;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo_.Game;
import modelo_.Opciones;
import vista_.Vista;
import vista_.VistaGUI;

public class Controlador implements MouseListener, ActionListener{
    private Game modelo;
    private Vista vista;

    public Controlador(Game modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarInterfaz(){
        vista.mostrarVista(this);
    }

    public void jugar() {
        Opciones opcionUsuario = vista.obtenerOpcionUsuario();
        Opciones opcionMaquina = modelo.generarOpcionMaquina();

        vista.mostrarOpcionUsuario(opcionUsuario);
        vista.mostrarOpcionMaquina(opcionMaquina);

        modelo.actualizarPuntuacion(opcionUsuario, opcionMaquina);

        int puntosUsuario = modelo.getPuntosUsuario();
        int puntosMaquina = modelo.getPuntosMaquina();

        vista.mostrarPuntuacion(puntosUsuario, puntosMaquina);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() != null){
        if (e.getSource() == VistaGUI.piedra){
            VistaGUI.opciongui = Opciones.PIEDRA;
        }else if (e.getSource() == VistaGUI.papel){
            VistaGUI.opciongui = Opciones.PAPEL;
        }else if (e.getSource() == VistaGUI.tijeras){
            VistaGUI.opciongui = Opciones.TIJERA;
        }
        jugar();
    }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jugar();
    }
}
