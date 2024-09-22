package Util;

public class Util {
   
    // Enum for Rating
    public enum Rating {
        UNASSIGNED,
        ONE_STAR,
        TWO_STARS,
        THREE_STARS,
        FOUR_STARS,
        FIVE_STARS;
    }

    // Enum for Trip Status
    public enum TripStatus {
        UNASSIGNED,
        DRIVER_ON_THE_WAY,
        DRIVER_ARRIVED,
        STARTED,
        PAUSED,
        CANCELLED,
        ENDED;
    }

    // Method to convert rating to string
    public static String ratingToString(Rating rating) {
        switch (rating) {
            case ONE_STAR:
                return "one star";
            case TWO_STARS:
                return "two stars";
            case THREE_STARS:
                return "three stars";
            case FOUR_STARS:
                return "four stars";
            case FIVE_STARS:
                return "five stars";
            default:
                return "invalid rating";
        }
    }

    // Method to check if rating is high
    public static boolean isHighRating(Rating rating) {
        return rating == Rating.FOUR_STARS || rating == Rating.FIVE_STARS;
    }
}
