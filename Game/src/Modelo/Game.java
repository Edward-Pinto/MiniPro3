package modelo;
import java.util.Random;

public class Game {
    private int puntosUsuario;
    private int puntosMaquina;

    public Game() {
        puntosUsuario = 0;
        puntosMaquina = 0;
    }

    public Opciones generarOpcionMaquina() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(3);
        return Opciones.values()[numeroAleatorio];
    }

    public void actualizarPuntuacion(Opciones opcionUsuario, Opciones opcionMaquina) {
        if (opcionUsuario.equals(opcionMaquina)) {
            // Empate, no se suman puntos
        } else if ((opcionUsuario.equals(Opciones.PIEDRA) && opcionMaquina.equals(Opciones.TIJERA))
                || (opcionUsuario.equals(Opciones.PAPEL) && opcionMaquina.equals(Opciones.PIEDRA))
                || (opcionUsuario.equals(Opciones.TIJERA) && opcionMaquina.equals(Opciones.PAPEL))) {
            puntosUsuario++;
        } else {
            puntosMaquina++;
        }
    }

    public int getPuntosUsuario() {
        return puntosUsuario;
    }

    public int getPuntosMaquina() {
        return puntosMaquina;
    }
}
