package Controlador;

import javax.swing.Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Game;
import Modelo.Opciones;
import Vista.Vista;

public class Controlador implements ActionListener{
    private Game modelo;
    private Vista vista;

    public Controlador(Game modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarVista(){
        vista.mostrarVista(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {




        if( e == null){
            Opciones opcionUsuario = vista.obtenerOpcionUsuario();
            Opciones opcionMaquina = modelo.generarOpcionMaquina();

            vista.mostrarOpcionUsuario(opcionUsuario);
            vista.mostrarOpcionMaquina(opcionMaquina);

            modelo.actualizarPuntuacion(opcionUsuario, opcionMaquina);

            int puntosUsuario = modelo.getPuntosUsuario();
            int puntosMaquina = modelo.getPuntosMaquina();

            vista.mostrarPuntuacion(puntosUsuario, puntosMaquina);
        }
        
    }
}
