package clases;



import java.util.Objects;


public class Game extends CatalogItem {
    //region attributes/fields



    private Developer developer;

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





    //endregion
//region Constructor
    public Game(String title, int releaseYear, Developer developer) {
        super(title, releaseYear);

        validateDeveloper(developer);
        idNext = idNext+1;
        id = idNext;
        this.developer = developer;

    }



    //endregion
    //region Methods

    @Override
    public String toString() {
        return "Game {" +
                "title ="+ getTitle() +
                ", releaseYear="+getReleaseYear() +
                ", developer=" + developer +
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

    private void validateDeveloper(Developer developer) {
        if (developer == null) throw new IllegalArgumentException("developer cannot null ");
    }
}

