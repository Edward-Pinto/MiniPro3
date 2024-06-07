package modelo_;
import java.util.Random;
// Clase Game que se encarga de gestionar la lógica del juego Piedra, Papel o Tijera.
public class Game {
    private int puntosUsuario;
    private int puntosMaquina;

    //Constructor de la clase Game que inicializa las variables de instancia puntosUsuario y puntosMaquina a 0.
    public Game() {
        puntosUsuario = 0;
        puntosMaquina = 0;
    }
    // Este método se utiliza para generar una elección aleatoria para la computadora.
    public Opciones generarOpcionMaquina() {
        // Primero crea un objeto aleatorio para generar un número entero aleatorio entre 0 y 2 (inclusive).
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(3);
        // Luego, devuelve el valor de enumeración de Opciones correspondiente al número entero generado.
        return Opciones.values()[numeroAleatorio];
    }
    // Este método se utiliza para actualizar la puntuación del usuario y de la computadora según sus elecciones.
    public void actualizarPuntuacion(Opciones opcionUsuario, Opciones opcionMaquina) {
        //Se verifica si la elección del usuario es la misma que la elección de la máquina. si es True, empate.
        if (opcionUsuario.equals(opcionMaquina)) {
            // Empate, no se suman puntos
        } else if ((opcionUsuario.equals(Opciones.PIEDRA) && opcionMaquina.equals(Opciones.TIJERA))
                || (opcionUsuario.equals(Opciones.PAPEL) && opcionMaquina.equals(Opciones.PIEDRA))
                || (opcionUsuario.equals(Opciones.TIJERA) && opcionMaquina.equals(Opciones.PAPEL))) {
            puntosUsuario++;
            // Verifica si la elección del usuario supera a la elección de la computadora. Si True, suma puntosUsuario en 1.
        } else {
            // En caso contrario incrementa en 1 la variable de instancia puntosMaquina.
            puntosMaquina++;
        }
    }
    // métodos getter de la clase Game que devuelven los valores de las variables de instancia puntosUsuario y puntosMaquina.
    public int getPuntosUsuario() {
        return puntosUsuario;
    }

    public int getPuntosMaquina() {
        return puntosMaquina;
    }
}
