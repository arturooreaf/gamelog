package com.arturooreaf.gamelog.clases;

public class User {
    //region attributes/fields
    private String username;
    private String email;
    private String password;
//endregion

    //region Setters and getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        validateUsername(username);
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validatePassword(password);
        this.password = password;
    }
    //endregion

    //region Constructor
    public User(String username, String email, String password) {
        validateUsername(username);
        validateEmail(email);
        validatePassword(password);

        this.password = password;
        this.username = username;
        this.email = email;
    }

    //endregion

    //region Methods
    @Override
    public String toString() {
        return " Username: "+ this.username + "| Email: " + this.email + "| Password: "+ "******";
    }

    private void validatePassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("The password cannot null or blank");
        }
        if (password.length() < 8 || password.length() > 15) {
            throw new IllegalArgumentException("The password need min 8 characters and max 15");
        }
    }

    private void validateUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("The username cannot null or blank");
        }
    }

    private void validateEmail(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("The email cannot null or blank");
        }
    }

    //endregion
}




