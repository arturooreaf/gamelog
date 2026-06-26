package clases;

import enumerados.GameStatus;



public class Game extends CatalogItem {
    //region attributes/fields

    private Developer developer;
    private GameStatus status;

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

    //endregion

private void validateStatus(GameStatus status){
    if (status == null) throw new IllegalArgumentException("status cannot null ");
}
    private void validateDeveloper(Developer developer) {
        if (developer == null) throw new IllegalArgumentException("developer cannot null ");
    }
}

