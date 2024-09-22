package Manager;

import java.util.HashMap;
import java.util.Map;

import Model.Rider;

public class RiderMgr {
    private static RiderMgr riderMgrInstance;
    private static final Object lock = new Object();
    private Map<String, Rider> ridersMap;

    // Private constructor to enforce singleton pattern
    private RiderMgr() {
        ridersMap = new HashMap<>();
    }

    // Method to get the singleton instance of RiderMgr
    public static RiderMgr getRiderMgr() {
        if (riderMgrInstance == null) {
            synchronized (lock) {
                if (riderMgrInstance == null) {
                    riderMgrInstance = new RiderMgr();
                }
            }
        }
        return riderMgrInstance;
    }

    // Method to add a rider to the map
    public void addRider(String riderName, Rider rider) {
        ridersMap.put(riderName, rider);
    }

    // Method to get a rider by name
    public Rider getRider(String riderName) {
        return ridersMap.get(riderName);
    }
}
