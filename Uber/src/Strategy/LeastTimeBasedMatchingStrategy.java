package Strategy;

import java.util.Map;

import Manager.DriverMgr;
import Model.Driver;
import Model.TripMetaData;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy {

    @Override
    public Driver matchDriver(TripMetaData metaData) {
        DriverMgr driverMgr = DriverMgr.getDriverMgr();

        if (driverMgr.getDrivers().isEmpty()) {
            System.out.println("No drivers!");
        }

        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");
        
        // Retrieve the first driver from the map (assuming it’s ordered by proximity)
        Map<String, Driver> driversMap = driverMgr.getDrivers();
        Driver driver = driversMap.values().stream().findFirst().orElse(null);

        if (driver != null) {
            System.out.println("Setting " + driver.getDriverName() + " as driver");
            metaData.setDriverRating(driver.getRating());
        }

        return driver;
    }
}
