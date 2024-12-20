package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Plane class
class Plane {
    // Private variables
    private int maxPassengers;
    private List<String> passengers;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to onboard passengers
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot onboard passenger. Maximum capacity reached.");
        }
    }

    // Method to get the take-off time
    public Date takeOff() {
        return new Date();
    }

    // Method to land the plane
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // Method to get the last landing time
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Method to get the list of passengers
    public List<String> getPassengers() {
        return passengers;
    }
}