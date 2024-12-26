package Activity7;

//BicycleParts interface
interface BicycleParts {
 int gears = 0;
 int speed = 0;
}

//BicycleOperations interface
interface BicycleOperations {
 void applyBrake(int decrement);
 void speedUp(int increment);
}

//Base class Bicycle implementing both interfaces
class Bicycle implements BicycleParts, BicycleOperations {
 private int gears;
 private int currentSpeed;

 // Constructor to initialize gears and current speed
 public Bicycle(int gears, int currentSpeed) {
     this.gears = gears;
     this.currentSpeed = currentSpeed;
 }

 // Implementation of applyBrake method
 @Override
 public void applyBrake(int decrement) {
     currentSpeed -= decrement;
 }

 // Implementation of speedUp method
 @Override
 public void speedUp(int increment) {
     currentSpeed += increment;
 }

 // Method to describe the bicycle
 public String bicycleDesc() {
     return "Number of gears: " + gears + ", Current speed: " + currentSpeed;
 }
}

//Derived class MountainBike extending Bicycle
class MountainBike extends Bicycle {
 private int seatHeight;

 // Constructor for MountainBike
 public MountainBike(int gears, int currentSpeed, int seatHeight) {
     super(gears, currentSpeed); // Call to superclass constructor
     this.seatHeight = seatHeight;
 }

 // Method to set the seat height
 public void setHeight(int newHeight) {
     this.seatHeight = newHeight;
 }

 // Override the bicycleDesc method
 @Override
 public String bicycleDesc() {
     return super.bicycleDesc() + ", Seat height: " + seatHeight;
 }
}



