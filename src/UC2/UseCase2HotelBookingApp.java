package UC2;

public class UseCase2HotelBookingApp {

    public static void main(String[] args) {

        // Create room objects
        room singleRoom = new singleroom();
        room doubleRoom = new doubleroom();
        room suiteRoom = new suite();

        // Static availability (simple variables)
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        System.out.println("=== Single Room ===");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\n=== Double Room ===");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\n=== Suite Room ===");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}