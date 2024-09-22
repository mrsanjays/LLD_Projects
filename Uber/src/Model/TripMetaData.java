package Model;
import Util.Util;
import Util.Location;
public class TripMetaData {
    private Location srcLoc;
    private Location dstLoc;
    private Util.Rating riderRating;
    private Util.Rating driverRating;

    // Constructor
    public TripMetaData(Location srcLoc,Location dstLoc, Util.Rating riderRating) {
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.riderRating = riderRating;
        this.driverRating = Util.Rating.UNASSIGNED;
    }

    // Getter for rider rating
    public Util.Rating getRiderRating() {
        return riderRating;
    }

    // Getter for driver rating
    public Util.Rating getDriverRating() {
        return driverRating;
    }

    // Setter for driver rating
    public void setDriverRating(Util.Rating driverRating) {
        this.driverRating = driverRating;
    }

    // Additional getters and setters for srcLoc and dstLoc if needed
    public Location getSrcLoc() {
        return srcLoc;
    }

    public Location getDstLoc() {
        return dstLoc;
    }

    public void setSrcLoc(Location srcLoc) {
        this.srcLoc = srcLoc;
    }

    public void setDstLoc(Location dstLoc) {
        this.dstLoc = dstLoc;
    }
}
