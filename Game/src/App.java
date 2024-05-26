import Modelo.Game;

public class App {
    public static void main(String[] args) throws Exception {
        
        Game game = new Game();
        game.setEleccion_CPU();
        System.out.println(game.getEleccion_CPU());
    }
}
