package com.arturooreaf.gamelog;

import com.arturooreaf.gamelog.clases.Game;
import com.arturooreaf.gamelog.clases.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    private final GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {

        this.gameRepository = gameRepository;
    }

    @GetMapping("/games")
    public List<Game> getGames() {
        return gameRepository.findAll();
    }
}

