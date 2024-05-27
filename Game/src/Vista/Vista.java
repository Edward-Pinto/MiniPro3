package Vista;
import Controlador.ControladorGame;

public interface Vista {
    public void mostrarVista(ControladorGame controlador);
    public int opc_player();
    public int opc_CPU();
    public int setpuntaje();
    public String win();
    public void resetGame();
}
