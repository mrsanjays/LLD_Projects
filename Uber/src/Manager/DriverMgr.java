package Manager;

import java.util.HashMap;
import java.util.Map;

import Model.Driver;

public class DriverMgr {
    private static DriverMgr driverMgrInstance;
    private static final Object lock = new Object();
    private Map<String, Driver> driversMap;

    // Private constructor to enforce singleton pattern
    private DriverMgr() {
        driversMap = new HashMap<>();
    }

    // Method to get the singleton instance of DriverMgr
    public static DriverMgr getDriverMgr() {
        if (driverMgrInstance == null) {
            synchronized (lock) {
                if (driverMgrInstance == null) {
                    driverMgrInstance = new DriverMgr();
                }
            }
        }
        return driverMgrInstance;
    }

    // Method to add a driver to the map
    public void addDriver(String driverName, Driver driver) {
        driversMap.put(driverName, driver);
    }

    // Method to get a driver by name
    public Driver getDriver(String driverName) {
        return driversMap.get(driverName);
    }

    // Method to get the map of all drivers
    public Map<String, Driver> getDrivers() {
        return driversMap;
    }
}
