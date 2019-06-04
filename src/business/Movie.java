package business;

public class Movie {

    private String name;

    public Movie() {

    }

    public Movie(String newName) {
        this.name = newName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

}
