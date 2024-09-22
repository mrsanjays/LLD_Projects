package Manager;



import Model.TripMetaData;
import Strategy.DefaultPricingStrategy;
import Strategy.DriverMatchingStrategy;
import Strategy.LeastTimeBasedMatchingStrategy;
import Strategy.PricingStrategy;
import Strategy.RatingBasedPricingStrategy;

public class StrategyMgr {
    private static StrategyMgr strategyMgrInstance;
    private static final Object lock = new Object();

    // Private constructor to enforce singleton pattern
    private StrategyMgr() {
    }

    // Method to get the singleton instance of StrategyMgr
    public static StrategyMgr getStrategyMgr() {
        if (strategyMgrInstance == null) {
            synchronized (lock) {
                if (strategyMgrInstance == null) {
                    strategyMgrInstance = new StrategyMgr();
                }
            }
        }
        return strategyMgrInstance;
    }

    // Method to determine the pricing strategy
    public PricingStrategy determinePricingStrategy(TripMetaData metaData) {
        System.out.println("Based on location and other factors, setting pricing strategy");
        //return new DefaultPricingStrategy();
        return new RatingBasedPricingStrategy();
        /*
         *  if (metaData.getDistance() > 50) {
		        return new LongDistancePricingStrategy();
		    } else if (metaData.getRiderRating() > 4.5) {
		        return new HighRatingDiscountPricingStrategy();
		    } else {
		        return new DefaultPricingStrategy();
		    }
         */
    }

    // Method to determine the driver matching strategy
    public DriverMatchingStrategy determineMatchingStrategy(TripMetaData metaData) {
        System.out.println("Based on location and other factors, setting matching strategy");
        return new LeastTimeBasedMatchingStrategy();
    }
}
