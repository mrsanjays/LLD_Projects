package Manager;

import java.util.HashMap;
import java.util.Map;

import Model.Driver;
import Model.Rider;
import Model.Trip;
import Model.TripMetaData;
import Strategy.DriverMatchingStrategy;
import Strategy.PricingStrategy;
import Util.Location;

public class TripMgr {
    private static TripMgr tripMgrInstance;
    private static final Object lock = new Object();
    private Map<Integer, TripMetaData> tripsMetaDataInfo;
    private Map<Integer, Trip> tripsInfo;
    private RiderMgr riderMgr;
    private DriverMgr driverMgr;

    // Private constructor to enforce singleton pattern
    private TripMgr() {
        riderMgr = RiderMgr.getRiderMgr();
        driverMgr = DriverMgr.getDriverMgr();
        tripsMetaDataInfo = new HashMap<>();
        tripsInfo = new HashMap<>();
    }

    // Method to get the singleton instance of TripMgr
    public static TripMgr getTripMgr() {
        if (tripMgrInstance == null) {
            synchronized (lock) {
                if (tripMgrInstance == null) {
                    tripMgrInstance = new TripMgr();
                }
            }
        }
        return tripMgrInstance;
    }

    // Method to create a trip
    public void createTrip(Rider rider, Location srcLoc, Location dstLoc) {
        TripMetaData metaData = new TripMetaData(srcLoc, dstLoc, rider.getRating());
        StrategyMgr strategyMgr = StrategyMgr.getStrategyMgr();
        PricingStrategy pricingStrategy = strategyMgr.determinePricingStrategy(metaData);
        DriverMatchingStrategy driverMatchingStrategy = strategyMgr.determineMatchingStrategy(metaData);

        Driver driver = driverMatchingStrategy.matchDriver(metaData);
        double tripPrice = pricingStrategy.calculatePrice(metaData);

        Trip trip = new Trip(rider, driver, srcLoc, dstLoc, tripPrice, pricingStrategy, driverMatchingStrategy);
        int tripId = trip.getTripId();
        tripsInfo.put(tripId, trip);
        tripsMetaDataInfo.put(tripId, metaData);
    }

    // Method to get the trips map
    public Map<Integer, Trip> getTrips() {
        return tripsInfo;
    }
}
