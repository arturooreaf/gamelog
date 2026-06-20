package clases;

public class Developer {
//region atributos
    private String name;
    private int yearfounding;
    //endregion
//region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearfounding() {
        return yearfounding;
    }

    public void setYearfounding(int yearfounding) {
        this.yearfounding = yearfounding;
    }
    //endregion

    //region Constructores
    public Developer(String name, int yearfounding){
        if (name == null || name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("The name of developers cannot be blank");

        }
        if(yearfounding<0){
            throw new IllegalArgumentException("The developer studio must have been released in a positive year");
        }

        this.name = name;

        this.yearfounding = yearfounding;

    }
    //endregion

    @Override
    public String toString() {
        return "The developer studio is : " + this.name + " was founded in the year: " + this.yearfounding;
    }
}
