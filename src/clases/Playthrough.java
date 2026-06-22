package clases;

import enumerados.GameStatus;

public class Playthrough {

    //region Attributes/fields
    private User user;
    private Game game;
    private GameStatus status;
    private double hoursPlayed;

    //endregion
    //region Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        validateUser(user);
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        validateGame(game);
        this.game = game;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        validateGameStatus(status);
        this.status = status;
    }

    public double getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(double hoursPlayed) {
        validateHoursplayed(hoursPlayed);
        this.hoursPlayed = hoursPlayed;
    }

    //endregion
    //region Constructor
    public Playthrough(User user, Game game, GameStatus gameStatus, double hoursPlayed) {
        validateUser(user);
        validateGame(game);
        validateHoursplayed(hoursPlayed);
        validateGameStatus(gameStatus);
        this.status = gameStatus;
        this.user = user;
        this.game = game;
        this.hoursPlayed = hoursPlayed;
    }


    //endregion
    @Override
    public String toString() {
        return "The user " + this.user + "Play: " + this.game + "Hours: " + this.hoursPlayed;
    }
//region Methods

    private void validateHoursplayed(Double hoursPlayed) {
        if(hoursPlayed<0.0) throw new IllegalArgumentException("You can't play negative hours ");
    }

    private void validateGame(Game game) {
        if(game == null) throw new IllegalArgumentException("The game cannot be null ");
    }

    private void validateUser(User user) {
        if(user == null) throw new IllegalArgumentException("The user cannot be null ");
    }

    private void validateGameStatus(GameStatus gameStatus) {
        if (gameStatus == null) throw new IllegalArgumentException("status cannot null ");
    }
    //endregion
}
