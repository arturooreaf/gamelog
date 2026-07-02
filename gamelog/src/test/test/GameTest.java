package test;

import clases.Developer;
import clases.Game;
import enumerados.GameStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTest {
    @Test
    void createGame_withValidData_shouldReturnTitle() {
            Developer dev1 = new Developer("From Software", 1986);
            Game game1 = new Game("Dark Souls", 2011, dev1, GameStatus.COMPLETED);

            assertEquals("Dark Souls", game1.getTitle());


    }
    @Test
    void createRecipe_withEmptyName_shouldThrowException() {
        Developer dev1 = new Developer("From Software", 1986);

        assertThrows(IllegalArgumentException.class, () -> {
            new Game("", 1999, dev1, GameStatus.COMPLETED);
        });
    }


    @Test
    void createGame_withInvalidYear_shouldThrowException() {
        Developer dev1 = new Developer("From Software", 1932);
        assertThrows(IllegalArgumentException.class, () -> {
            new Game ("Dark Soul", 1800, dev1, GameStatus.BACKLOG);
                });

    }
}
