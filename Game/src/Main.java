import Controlador.Controlador;
import Modelo.Game;
import Vista.VistaGUI;
import Vista.VistaTerminal;
public class Main {
    
    public static void main(String[] args) {
        
        Game modelo = new Game();
        VistaTerminal vista = new VistaTerminal();
        Controlador controlador = new Controlador(modelo, vista);

        boolean seguirJugando = true;
        while (seguirJugando) {
            controlador.mostrarVista();
            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            String respuesta = vista.scanner.nextLine().toLowerCase();
            seguirJugando = respuesta.equals("s");
        }

    }
}
