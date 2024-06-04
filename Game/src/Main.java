import java.util.InputMismatchException;
import java.util.Scanner;

import controlador_.Controlador;
import modelo_.Game;
import vista_.VistaGUI;
import vista_.VistaTerminal;
public class Main {
    public static void main(String[] args) {
        Game modelo = new Game();

        while(true){
            try{
                System.out.println("0. Salir");
                System.out.println("1. GUI");
                System.out.println("2. Terminal");

                Scanner scanner = new Scanner(System.in);
                byte opc = scanner.nextByte();

                
                if(opc == 1){
                    VistaGUI vista = new VistaGUI();
                    Controlador controlador = new Controlador(modelo, vista);
                    controlador.mostrarInterfaz();
                    break;
                }else if(opc == 2){
                    VistaTerminal vista = new VistaTerminal();
                    Controlador controlador = new Controlador(modelo, vista);
                    controlador.mostrarInterfaz();
                    break;
                }else if(opc == 0){
                    break;
                }else{
                    System.out.println("Por favor ingrese un numero valido");
                }
            }catch(InputMismatchException e){
                System.out.println("Por favor ingresa un numero valido");
            }
        }
    }
}
