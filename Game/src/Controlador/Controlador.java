package Controlador;

import Modelo.Game;
import Modelo.Opciones;
import Vista.Vista;

public class Controlador {
    private Game modelo;
    private Vista vista;

    public Controlador(Game modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
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
}
