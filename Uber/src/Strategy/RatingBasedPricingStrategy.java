package Strategy;

import Model.TripMetaData;
import Util.Util;

public class RatingBasedPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        double price = Util.isHighRating(tripMetaData.getRiderRating()) ? 55.0 : 65.0;
        System.out.println("Based on " + Util.ratingToString(tripMetaData.getRiderRating()) +
                           " rider rating, price of the trip is " + price);
        return price;
    }
}
