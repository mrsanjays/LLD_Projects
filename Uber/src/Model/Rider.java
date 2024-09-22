package Model;
import Util.Util;

public class Rider {
    private String name;
    private Util.Rating rating;

    // Constructor
    public Rider(String name, Util.Rating rating) {
        this.name = name;
        this.rating = rating;
    }

    // Getter for rider name
    public String getRiderName() {
        return name;
    }

    // Getter for rider rating
    public Util.Rating getRating() {
        return rating;
    }
}
