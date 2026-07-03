package test;

import com.arturooreaf.gamelog.clases.User;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    @Test
    void createUsername_withEmptyUsername(){
        assertThrows(IllegalArgumentException.class, () -> {
            new User("","aoreaf@gmail.com","12345678");
        });
    }
    @Test
    void createEmail_withOutSymbolEmail(){
        assertThrows(IllegalArgumentException.class, () -> {
            new User("Artuurx","aoreafgmail.com","12345678");
        });
    }
    @Test
    void createPassword_withEmptyPassword(){
        assertThrows(IllegalArgumentException.class, () -> {
            new User("Artuurx","aoreaf@gmail.com","");
        });
    }
}
