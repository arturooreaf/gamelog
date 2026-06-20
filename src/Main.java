import clases.Developer;
import clases.Game;
import enumerados.GameStatus;


void main() {
    Developer dev1 = new Developer("From Software", 1986);

Game game1 = new Game ("Dark Souls",2011,dev1, GameStatus.COMPLETED);
    System.out.println(game1);

}
