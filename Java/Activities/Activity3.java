package activities;

public class Activity3 {

    // Constants for orbital periods in Earth years
    static final double EARTH_YEAR_SECONDS = 31557600;
    static final double MERCURY_YEAR = 0.2408467;
    static final double VENUS_YEAR = 0.61519726;
    static final double MARS_YEAR = 1.8808158;
    static final double JUPITER_YEAR = 11.862615;
    static final double SATURN_YEAR = 29.447498;
    static final double URANUS_YEAR = 84.016846;
    static final double NEPTUNE_YEAR = 164.79132;

    public static void main(String[] args) {
        // Example input: age in seconds
        long ageInSeconds = 1000000000L;

        // Calculate age on each planet
        System.out.printf("Age on Earth: %.2f years\n", calculateAge(ageInSeconds, 1));
        //System.out.printf("Age on Mercury: %.2f years\n", calculateAge(ageInSeconds, MERCURY_YEAR));
        //System.out.printf("Age on Venus: %.2f years\n", calculateAge(ageInSeconds, VENUS_YEAR));
        //System.out.printf("Age on Mars: %.2f years\n", calculateAge(ageInSeconds, MARS_YEAR));
        //System.out.printf("Age on Jupiter: %.2f years\n", calculateAge(ageInSeconds, JUPITER_YEAR));
        //System.out.printf("Age on Saturn: %.2f years\n", calculateAge(ageInSeconds, SATURN_YEAR));
        //System.out.printf("Age on Uranus: %.2f years\n", calculateAge(ageInSeconds, URANUS_YEAR));
        //System.out.printf("Age on Neptune: %.2f years\n", calculateAge(ageInSeconds, NEPTUNE_YEAR));
    }

    // Method to calculate age on a planet
    public static double calculateAge(long seconds, double orbitalPeriodInEarthYears) {
        return seconds / (EARTH_YEAR_SECONDS * orbitalPeriodInEarthYears);
    }
}
