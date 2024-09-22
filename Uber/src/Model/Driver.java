package Model;

import Util.Util;
import Util.Util.Rating;

public class Driver {
	private String name;
	
	private boolean isAvailable;
	private Util.Rating rating;
	public Driver(String name, Rating rating) {
		this.name = name;
		this.isAvailable = false;  // Set availability to false initially
		this.rating = rating;
	}
	 public void updateAvail(boolean available) {
	        this.isAvailable = available;
	 }

    // Getter for driver name
    public String getDriverName() {
        return name;
    }

    // Getter for driver rating
    public Util.Rating getRating() {
        return rating;
    }
	
	

}
