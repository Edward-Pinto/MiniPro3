import java.util.InputMismatchException;
import java.util.Scanner;

import controlador_.Controlador;
import modelo_.Game;
import vista_.VistaGUI;
import vista_.VistaTerminal;
public class Main {
    public static void main(String[] args) {
        // Se crea objeto Game que representa la lógica del juego.
        Game modelo = new Game();
        // El bucle se ejecuta mientras el usuario no ingrese una opción válida, para dar continuidad al juego
        while(true){
            try{
                System.out.println("0. Salir");
                System.out.println("1. GUI");
                System.out.println("2. Terminal");

                Scanner scanner = new Scanner(System.in);
                byte opc = scanner.nextByte();

                
                if(opc == 1){
                    // Se crea un objeto VistaGUI que representa la vista gráfica del juego.
                    VistaGUI vista = new VistaGUI();
                    // Se crea un objeto Controlador que conecta la vista y la lógica del juego.
                    Controlador controlador = new Controlador(modelo, vista);
                    // Se muestra la vista gráfica del juego.
                    controlador.mostrarInterfaz();
                    break;
                }else if(opc == 2){ //Opción 2, opción de la terminal.
                    //Se crean los objetos VistaTerminal y Controlador.
                    VistaTerminal vista = new VistaTerminal();
                    Controlador controlador = new Controlador(modelo, vista);
                    controlador.mostrarInterfaz();
                    break;
                }else if(opc == 0){
                    break;
                }else{
                    System.out.println("Por favor ingrese un numero valido");
                }
            // Si el usuario ingresa una entrada no numérica, se captura la excepción y se muestra un mensaje de error.
            }catch(InputMismatchException e){
                System.out.println("Por favor ingresa un numero valido");
            }
        }
    }
}