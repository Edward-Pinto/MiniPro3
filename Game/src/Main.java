import controlador.Controlador;
import modelo.Game;
import vista.VistaGUI;
import vista.VistaTerminal;
public class Main {
    public static void main(String[] args) {
        Game modelo = new Game();
        VistaGUI gui = new VistaGUI();
        VistaTerminal vista = new VistaTerminal();
        Controlador controlador = new Controlador(modelo, gui);
        controlador.mostrarInterfaz();

    }
}
