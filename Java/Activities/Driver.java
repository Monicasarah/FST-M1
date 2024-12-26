package Activity7;

//Driver class
public class Driver {
public static void main(String[] args) {
   // Create an object of MountainBike
   MountainBike mountainBike = new MountainBike(5, 20, 25);

   // Access methods and variables
   System.out.println(mountainBike.bicycleDesc());

   // Modify properties
   mountainBike.speedUp(10);
   mountainBike.applyBrake(5);
   mountainBike.setHeight(30);

   // Display updated description
   System.out.println(mountainBike.bicycleDesc());
}
}