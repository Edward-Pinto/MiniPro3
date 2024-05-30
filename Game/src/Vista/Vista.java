package Vista;

import Modelo.Opciones;
import Controlador.Controlador;

public interface Vista {
    void mostrarVista(Controlador controlador);
    void mostrarOpcionUsuario(Opciones opcion);
    void mostrarOpcionMaquina(Opciones opcion);
    void mostrarResultado(String resultado);
    void mostrarPuntuacion(int puntosUsuario, int puntosMaquina);
    Opciones obtenerOpcionUsuario();
}
