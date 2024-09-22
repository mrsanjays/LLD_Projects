package App;

import Manager.DriverMgr;
import Manager.RiderMgr;
import Manager.TripMgr;
import Model.Driver;
import Model.Rider;
import Model.Trip;
import Util.Location;
import Util.Util.Rating;

public class Main {
    public static void main(String[] args) {
        // Creating Riders and Drivers
        Rider rider1 = new Rider("Ram", Rating.FIVE_STARS);
        Rider rider2 = new Rider("Gauri", Rating.FIVE_STARS);
        
        RiderMgr riderMgr = RiderMgr.getRiderMgr();
        riderMgr.addRider("Ram", rider1);
        riderMgr.addRider("Gauri", rider2);

        Driver driver1 = new Driver("Praveen", Rating.THREE_STARS);
        Driver driver2 = new Driver("Ridhun", Rating.FOUR_STARS);
        
        DriverMgr driverMgr = DriverMgr.getDriverMgr();
        driverMgr.addDriver("Praveen", driver1);
        driverMgr.addDriver("Ridhun", driver2);

        // Creating TripMgr instance
        TripMgr tripMgr = TripMgr.getTripMgr();

        // Creating Trips
        System.out.println("\nCreating Trip for Ram from location (10,10) to (30,30)");
        tripMgr.createTrip(rider1, new Location(10, 10), new Location(30, 30));

        System.out.println("\nCreating Trip for Gauri from location (200,200) to (500,500)");
        tripMgr.createTrip(rider2, new Location(200, 200), new Location(500, 500));

        // Displaying all created trips
        System.out.println("\nDisplaying all trips:");
        for (Trip trip : tripMgr.getTrips().values()) {
            trip.displayTripDetails();
        }
    }
}