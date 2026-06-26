package clases;

import java.util.List;

public interface GameRepository {
void save(Game game);
    Game findById(int id);
    List<Game> findAll();
    void delete(int id);
}
