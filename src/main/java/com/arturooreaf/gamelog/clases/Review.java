package com.arturooreaf.gamelog.clases;

import java.time.LocalDate;

public class Review {
    //region Attributes/fields
    private User user;
    private Game game;
    private int rating;
    private String comment;
    private LocalDate publishedDate;

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        validateRating(rating);
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        validateComment(comment);
        this.comment = comment;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        validatePublishedDate(publishedDate);
        this.publishedDate = publishedDate;
    }

    //endregion
    //region Constructor
    public Review(User user, Game game, int rating, String comment, LocalDate publishedDate) {
        validateUser(user);
        validateGame(game);
        validateComment(comment);
        validateRating(rating);
        validatePublishedDate(publishedDate);
        this.user = user;
        this.game = game;
        this.rating = rating;
        this.comment = comment;
        this.publishedDate = publishedDate;

    }
    //endregion

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user +
                ", game=" + game +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", publishedDate=" + publishedDate +
                '}';
    }

    //region Methods
    private void validateGame(Game game) {
        if (game == null) throw new IllegalArgumentException("The game cannot be null ");
    }

    private void validateUser(User user) {
        if (user == null) throw new IllegalArgumentException("The user cannot be null ");
    }

    private void validateComment(String comment) {
        if (comment == null) throw new IllegalArgumentException("The comment cannot be null ");
    }

    private void validateRating(int rating) {
        if (rating < 1 || rating > 10) {
            throw new IllegalArgumentException("The score must be between 1 and 10");
        }
    }

    private void validatePublishedDate(LocalDate publishedDate) {
        if (publishedDate == null) throw new IllegalArgumentException("The publication date cannot be null");
    }
    //endregion

}
