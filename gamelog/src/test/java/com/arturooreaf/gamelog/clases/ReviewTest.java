package com.arturooreaf.gamelog.clases;

import com.arturooreaf.gamelog.clases.Developer;
import com.arturooreaf.gamelog.clases.Game;
import com.arturooreaf.gamelog.clases.Review;
import com.arturooreaf.gamelog.clases.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReviewTest {
    @Test
    void createReview_withRatingOverMax(){
        //Arrange
        User user1 = new User("Artuurx","aoreaf@mail.com","12344112");
        Developer dev1 = new Developer("Rockstar",1998);
        Game game1 = new Game("GTA4",2008,dev1);
            //Act & Assert
        assertThrows(IllegalArgumentException.class, () ->{
            new Review(user1,game1,20,"Wonderful game!", LocalDate.now());
        });
    }
}
