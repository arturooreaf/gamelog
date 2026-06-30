package com.arturooreaf.gamelog.clases;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryGameRepository implements GameRepository {
    private List<Game> games = new ArrayList<>();

    @Override
    public void save(Game game) {
        games.add(game);
    }

    @Override
    public Game findById(int id) {
        for (Game game : games) {

            if (game.getId() == id) {
                return game;
            }
        }
        return null;


    }

    @Override
    public List<Game> findAll() {
        return games;
    }

    @Override
    public void delete(int id) {
        for (Game game : games) {
            if (game.getId() == id) {
                 games.remove(game);
                 return;
            }
        }
    }

}
