public class Game {
    //region atributos
    private String title;
    private int releaseYear;

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
//region Constructore
    public Game(String title, int releaseYear) {
        this.title = title; // "el atributo de este objeto = el valor que me pasaron
        this.releaseYear = releaseYear;
    }
//endregion
}