package com.arturooreaf.gamelog.clases;

public class Developer {
//region attributes/fields
    private String name;
    private int foundingYear;
    //endregion
//region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        validateFoundingYear(foundingYear);
        this.foundingYear = foundingYear;
    }
    //endregion

    //region Constructor
    public Developer(String name, int foundingYear){
        validateName(name);
        validateFoundingYear(foundingYear);


        this.name = name;

        this.foundingYear = foundingYear;

    }
    //endregion

    @Override
    public String toString() {
        return "The developer studio is : " + this.name + " was founded in the year: " + this.foundingYear;
    }
    private void validateName (String name ){
        if (name == null || name.isBlank() ){
            throw new IllegalArgumentException("The name of developers cannot be blank");

        }

    }
    private void validateFoundingYear (int foundingYear){
        if(foundingYear<0){
            throw new IllegalArgumentException("The developer studio must have been released in a positive year");
        }
    }
}
