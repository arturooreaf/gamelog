package test;

import com.arturooreaf.gamelog.clases.Developer;
import com.arturooreaf.gamelog.clases.Game;
import com.arturooreaf.gamelog.clases.Playthrough;
import com.arturooreaf.gamelog.clases.User;
import com.arturooreaf.gamelog.enumerados.GameStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaythroughTest {

    @Test
    void createPlaythrough_withNegativeHours_shouldThrowException() {
        // Arrange (Preparar): Creamos los objetos válidos que necesitamos
        User testUser = new User("Artuurx", "aorgagd@gmail.com", "password123");
        Developer testDev = new Developer("From Software", 1986);
        Game testGame = new Game("Dark Souls", 2011, testDev);

        // Act & Assert (Actuar y Comprobar): Comprobamos que explota al poner horas negativas
        assertThrows(IllegalArgumentException.class, () -> {
            new Playthrough(testUser, testGame, GameStatus.PLAYING, -5.0);
        });
    }
}

