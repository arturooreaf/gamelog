package test;

import com.arturooreaf.gamelog.clases.Developer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeveloperTest {
    @Test
    void createDeveloper_withfoundingYearnegative (){
        //Act & Assert

        assertThrows(IllegalArgumentException.class, () -> {
            new Developer("Rockstar", -9999);
        });
    }
}
