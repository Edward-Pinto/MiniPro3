package vista;

import java.util.Scanner;

import controlador.Controlador;
import modelo.Opciones;

public class VistaTerminal implements Vista {
    public Scanner scanner;

    public VistaTerminal() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarOpcionUsuario(Opciones opcion) {
        System.out.println("Has elegido: " + opcion);
    }

    @Override
    public void mostrarOpcionMaquina(Opciones opcion) {
        System.out.println("La máquina ha elegido: " + opcion);
    }



    @Override
    public void mostrarPuntuacion(int puntosUsuario, int puntosMaquina) {
        System.out.println("Puntuación: Usuario: " + puntosUsuario + " - Máquina: " + puntosMaquina);
    }

    public Opciones obtenerOpcionUsuario() {
        System.out.println("Elige una opción: PIEDRA, PAPEL o TIJERA");
        String opcion = scanner.nextLine().toUpperCase();
        try {
            return Opciones.valueOf(opcion);
        } catch (IllegalArgumentException e) {
            System.out.println("Opción inválida, escribe la palabra");
            return obtenerOpcionUsuario();
        }
    }

    @Override
    public void mostrarVista(Controlador controlador) {
        System.out.println("BIENVENIDO A ULTIMATE PIEDRA PAPEL TIJERAS");
        boolean seguirJugando = true;
        while (seguirJugando) {
            controlador.actionPerformed(null);
            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            seguirJugando = respuesta.equals("s");
        }

    }
}