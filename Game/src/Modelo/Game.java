package Modelo;
import java.util.Random;

public class Game {

    //Variables a usar
    byte puntaje_player;
    byte puntaje_CPU;
    byte eleccion_player;
    byte eleccion_CPU;

    //limite superior e inferior de los numeros random
    int min = 0;
    int max = 2;

    //Constructor
    public Game(byte puntaje_player, byte puntaje_CPU, byte eleccion_player, byte eleccion_CPU) {
        this.puntaje_player = puntaje_player;
        this.puntaje_CPU = puntaje_CPU;
        this.eleccion_player = eleccion_player;
        this.eleccion_CPU = eleccion_CPU;
    }

    public Game(){
        
    }

    //METODOS GET AND SET

    public byte getPuntaje_player() {
        return puntaje_player;
    }

    public void setPuntaje_player(byte puntaje_player) {
        this.puntaje_player = puntaje_player;
    }

    public byte getPuntaje_CPU() {
        
        return puntaje_CPU;
    }
    public void setPuntaje_CPU(byte puntaje_CPU) {
        this.puntaje_CPU = puntaje_CPU;
    }

    public byte getEleccion_player() {
        return eleccion_player;
    }

    public void setEleccion_player(byte eleccion_player) {
        this.eleccion_player = eleccion_player;
    }

    public byte getEleccion_CPU() {
        return eleccion_CPU;
    }

    public void setEleccion_CPU() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt((max - min) + 1) + min;
        this.eleccion_CPU = (byte)numeroAleatorio;
    }


    
    
}