package vista;

import modelo.Opciones;
import controlador.Controlador;

public interface Vista {
    void mostrarVista(Controlador controlador);
    void mostrarOpcionUsuario(Opciones opcion);
    void mostrarOpcionMaquina(Opciones opcion);
    void mostrarPuntuacion(int puntosUsuario, int puntosMaquina);
    Opciones obtenerOpcionUsuario();
}
