package vista_;

import controlador_.Controlador;
import modelo_.Opciones;
//Interfaz Vista que define los métodos que deben ser implementados por las clases que representan la vista de la aplicación.
public interface Vista {
    // Muestra la vista de la aplicación y recibe un objeto Controlador como parámetro.
    void mostrarVista(Controlador controlador);
    //Muestra la opción seleccionada por el usuario en la vista de la aplicación y recibe un objeto Opciones como parámetro.
    void mostrarOpcionUsuario(Opciones opcion);
    // Muestra la opción seleccionada por la máquina en la vista de la aplicación y recibe un objeto Opciones como parámetro.
    void mostrarOpcionMaquina(Opciones opcion);
    // Muestra la puntuación actual del usuario y la máquina en la vista de la aplicación y recibe dos enteros como parámetros.
    void mostrarPuntuacion(int puntosUsuario, int puntosMaquina);
    //Método que obtiene la opción seleccionada por el usuario en la vista de la aplicación y devuelve un objeto Opciones.
    Opciones obtenerOpcionUsuario();
}
