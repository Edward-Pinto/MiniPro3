package Vista;

import Modelo.Opciones;

public interface Vista {
    void mostrarOpcionUsuario(Opciones opcion);
    void mostrarOpcionMaquina(Opciones opcion);
    void mostrarResultado(String resultado);
    void mostrarPuntuacion(int puntosUsuario, int puntosMaquina);
    Opciones obtenerOpcionUsuario();
}
