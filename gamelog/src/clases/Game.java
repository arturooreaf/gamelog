package clases;

import enumerados.GameStatus;

import java.util.Objects;


public class Game extends CatalogItem {
    //region attributes/fields



    private Developer developer;
    private GameStatus status;
    private static int idNext;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public static int getIdNext() {
        return idNext;
    }

    public static void setIdNext(int idNext) {
        Game.idNext = idNext;
    }


    //endregion
//region Getters and Setters


    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
       validateDeveloper(developer);
        this.developer = developer;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        validateStatus(status);
        this.status = status;
    }



    //endregion
//region Constructor
    public Game(String title, int releaseYear, Developer developer, GameStatus status) {
        super(title, releaseYear);
        validateStatus(status);
        validateDeveloper(developer);
        idNext = idNext+1;
        id = idNext;
        this.developer = developer;
        this.status = status;
    }



    //endregion
    //region Methods

    @Override
    public String toString() {
        return "Game {" +
                "title ="+ getTitle() +
                ", releaseYear="+getReleaseYear() +
                ", developer=" + developer +
                ", status=" + status +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(getTitle(), game.getTitle()) && getReleaseYear() == game.getReleaseYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getReleaseYear());
    }

    //endregion

private void validateStatus(GameStatus status){
    if (status == null) throw new IllegalArgumentException("status cannot null ");
}
    private void validateDeveloper(Developer developer) {
        if (developer == null) throw new IllegalArgumentException("developer cannot null ");
    }
}

