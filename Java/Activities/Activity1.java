package activities;

class Activity1 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Set the attributes of the car
        myCar.color = "Black";
        myCar.transmission = "Manual";
        myCar.make = 2014;

        // Display the car's characteristics
        myCar.displayCharacteristics();

        // Call the accelerate and brake methods
        myCar.accelerate();
        myCar.brake();
    }
}
