package clases;

import enumerados.GameStatus;

public class Game {
    //region atributos
    private String title;
    private int releaseYear;
    private Developer developer;
    private GameStatus status;

    //endregion
//region Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //endregion
//region Constructores
    public Game(String title, int releaseYear, Developer developer, GameStatus status) {
        if (releaseYear < 0 || releaseYear >= 2050) {
            throw new IllegalArgumentException("The game must have been released in a positive year");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("A game must have a title");
        }

        this.title = title; // "el atributo de este objeto = el valor que me pasaron
        this.releaseYear = releaseYear;
        this.developer = developer;
        this.status = status;
    }

    //endregion
    @Override
    public String toString() {
        return "The game is: " + this.title + " (" + this.releaseYear + ") | " + this.developer;
    }
}


