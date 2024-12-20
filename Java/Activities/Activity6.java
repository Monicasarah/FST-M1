package activities;

public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        System.out.println("Take-off time: " + plane.takeOff());

        System.out.println("Passengers onboard: " + plane.getPassengers());

          try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        plane.land();

      
        System.out.println("Landing time: " + plane.getLastTimeLanded());

        
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}

