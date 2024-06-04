package vista_;

import controlador_.Controlador;
import modelo_.Opciones;

public interface Vista {
    void mostrarVista(Controlador controlador);
    void mostrarOpcionUsuario(Opciones opcion);
    void mostrarOpcionMaquina(Opciones opcion);
    void mostrarPuntuacion(int puntosUsuario, int puntosMaquina);
    Opciones obtenerOpcionUsuario();
}
