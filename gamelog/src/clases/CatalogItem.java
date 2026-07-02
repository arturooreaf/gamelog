package clases;

public abstract class CatalogItem {
    private String title;
    private int releaseYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        validateReleaseYear(releaseYear);
        this.releaseYear = releaseYear;
    }
public CatalogItem(String title, int releaseYear){
        validateReleaseYear(releaseYear);
        validateTitle(title);
        this.releaseYear = releaseYear;
        this.title = title;
}

    @Override
    public String toString() {
        return "CatalogItem{" +
                " title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    //endregion
    private void validateReleaseYear(int releaseYear) {
        if (releaseYear < 1958 || releaseYear >= 2050) {
            throw new IllegalArgumentException("The game must have been released in a positive year");
        }
    }

    private void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("A game must have a title");
        }
    }
}
