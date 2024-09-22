package Model;

import Strategy.DriverMatchingStrategy;
import Strategy.PricingStrategy;
import Util.Location;
import Util.Util.TripStatus;

public class Trip {
    private Rider rider;
    private Driver driver;
    private Location srcLoc;
    private Location dstLoc;
    private TripStatus status;
    private int tripId;
    private double price;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;
    private static int nextTripId = 1;

    // Constructor
    public Trip(Rider rider, Driver driver, Location srcLoc, Location dstLoc, double price,
                PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.status = TripStatus.DRIVER_ON_THE_WAY;
        this.tripId = nextTripId++;
    }

    // Getter for tripId
    public int getTripId() {
        return tripId;
    }

    // Method to display trip details
    public void displayTripDetails() {
        System.out.println();
        System.out.println("Trip id - " + tripId);
        System.out.println("Rider - " + rider.getRiderName());
        System.out.println("Driver - " + driver.getDriverName());
        System.out.println("Price - " + price);
        System.out.println("Locations - " + srcLoc.getLatitude() + "," + srcLoc.getLongitude() +
                           " and " + dstLoc.getLatitude() + "," + dstLoc.getLongitude());
    }
}
