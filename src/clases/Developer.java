package clases;

public class Developer {
//region atributos
    private String name;
    private int foundingYear;
    //endregion
//region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }
    //endregion

    //region Constructores
    public Developer(String name, int foundingYear){
        if (name == null || name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("The name of developers cannot be blank");

        }
        if(foundingYear<0){
            throw new IllegalArgumentException("The developer studio must have been released in a positive year");
        }

        this.name = name;

        this.foundingYear = foundingYear;

    }
    //endregion

    @Override
    public String toString() {
        return "The developer studio is : " + this.name + " was founded in the year: " + this.foundingYear;
    }
}
