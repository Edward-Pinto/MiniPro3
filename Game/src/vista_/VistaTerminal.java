package vista_;

import java.util.Scanner;

import controlador_.Controlador;
import modelo_.Opciones;
// Clase VistaTerminal que implementa la interfaz Vista y representa la vista de la aplicación en la terminal.
public class VistaTerminal implements Vista {
    public Scanner scanner;

    public VistaTerminal() {
        scanner = new Scanner(System.in);
    }
    // Muestra la opción seleccionada por el usuario en la terminal.
    @Override
    public void mostrarOpcionUsuario(Opciones opcion) {
        System.out.println("Has elegido: " + opcion);
    }
    // Mestra la opción seleccionada por la máquina en la terminal.
    @Override
    public void mostrarOpcionMaquina(Opciones opcion) {
        System.out.println("La máquina ha elegido: " + opcion);
    }
    // Muestra la puntuación actual del usuario y la máquina en la terminal.
    @Override
    public void mostrarPuntuacion(int puntosUsuario, int puntosMaquina) {
        System.out.println("Puntuación: Usuario: " + puntosUsuario + " - Máquina: " + puntosMaquina);
    }
    // Se obtiene la opción seleccionada por el usuario en la terminal y devuelve un objeto Opciones.
    public Opciones obtenerOpcionUsuario() {
        System.out.println("Elige una opción: PIEDRA, PAPEL o TIJERA");
        String opcion = scanner.nextLine().toUpperCase();
        // Hace el try para convertir la cadena ingresada por el usuario en un valor del enum Opciones.
        try {
            return Opciones.valueOf(opcion);
        } catch (IllegalArgumentException e) {
            // Si la cadena ingresada por el usuario no es un valor válido del enum Opciones, muestra mensa de error y llama nuevamente al método.
            System.out.println("Opción inválida, escribe la palabra");
            return obtenerOpcionUsuario();
        }
    }
    // Se muestra la vista de la aplicación en la terminal y recibe un objeto Controlador como parámetro.
    @Override
    public void mostrarVista(Controlador controlador) {
        System.out.println("BIENVENIDO A ULTIMATE PIEDRA PAPEL TIJERAS");
        boolean seguirJugando = true;
        // Este bucle se ejecuta mientras el usuario quiera seguir jugando.
        while (seguirJugando) {
            // Llama al método actionPerformed del objeto Controlador para jugar una ronda.
            controlador.actionPerformed(null);
            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            // Lee la respuesta del usuario y la convierte a minúsculas.
            String respuesta = scanner.nextLine().toLowerCase();
            // Si la respuesta del usuario es "s", la variable seguirJugando se mantiene en true y el bucle se ejecuta otra vez.
            seguirJugando = respuesta.equals("s");
        }
    }
}