package controlador_;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo_.Game;
import modelo_.Opciones;
import vista_.Vista;
import vista_.VistaGUI;

// Clase Controlador que se encarga de gestionar las interacciones entre el Modelo y la Vista.
// Implementa las interfaces MouseListener y ActionListener para manejar la entrada del usuario desde la Vista.
public class Controlador implements MouseListener, ActionListener{
    // modelo es una instancia de la clase Game del paquete modelo_.
    // vista es una instancia de la clase Vista del paquete vista_.
    private Game modelo;
    private Vista vista;

    // constructor de la clase Controlador que toma como parámetros un objeto Juego y un objeto Vista.
    // Inicializa las variables de instancia de modelo y vista con los parámetros dados.
    public Controlador(Game modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    // Este método se utiliza para mostrar la Vista al usuario.
    // Llama al método mostrarVista de la instancia de Vista y se pasa a sí mismo (la instancia de Controlador) como parámetro.
    public void mostrarInterfaz(){
        vista.mostrarVista(this);
    }
    // método para jugar una ronda del juego Piedra, Papel o Tijera.
    public void jugar() {
        // Primero recupera la elección del usuario de la instancia de Vista y la elección de la computadora de la instancia de modelo.
        Opciones opcionUsuario = vista.obtenerOpcionUsuario();
        Opciones opcionMaquina = modelo.generarOpcionMaquina();

        vista.mostrarOpcionUsuario(opcionUsuario);
        vista.mostrarOpcionMaquina(opcionMaquina);

        modelo.actualizarPuntuacion(opcionUsuario, opcionMaquina);
        // Luego, actualiza la puntuación del usuario y de la computadora en la instancia del modelo según las opciones.
        int puntosUsuario = modelo.getPuntosUsuario();
        int puntosMaquina = modelo.getPuntosMaquina();

        vista.mostrarPuntuacion(puntosUsuario, puntosMaquina);
        // Finalmente, muestra la puntuación actualizada en la instancia de Vista.
    }
    // Este método se llama cuando el usuario hace clic en una de las opciones (Piedra, Papel o Tijera) en la Vista.
    @Override
    public void mouseClicked(MouseEvent e) {
        // Comprueba en qué opción ha hecho clic el usuario y actualiza la variable de instancia opciongui de la clase VistaGUI en consecuencia.
        if(e.getSource() != null){
        if (e.getSource() == VistaGUI.piedra){
            VistaGUI.opciongui = Opciones.PIEDRA;
        }else if (e.getSource() == VistaGUI.papel){
            VistaGUI.opciongui = Opciones.PAPEL;
        }else if (e.getSource() == VistaGUI.tijeras){
            VistaGUI.opciongui = Opciones.TIJERA;
        }
        // Luego, llama al método jugar para jugar una ronda del juego a elección del usuario.
        jugar();
    }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    // Cuando el usuario hace una acción en la vista, simplemente llama al método jugar para jugar una ronda del juego.
    @Override
    public void actionPerformed(ActionEvent e) {
        jugar();
    }
}
