package clases;
import java.util.ArrayList;
import java.util.List;

public class InMemoryGameRepository implements  GameRepository {
    private List<Game> games = new ArrayList<>();

    @Override
    public void save(Game game) {
        games.add(game);
    }

    @Override
    public Game findById(int id) {
        return null;
    }

    @Override
    public List<Game> findAll() {
        return games;
    }

    @Override
    public void delete(int id) {

    }

}
