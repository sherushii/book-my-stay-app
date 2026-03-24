package UC4;
package UC3;
import UC3.RoomInventory;

public class SearchService {
    private RoomInventory inventory;

    // Constructor
    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    // Method to display available rooms
    public void displayAvailableRooms() {

        System.out.println("=== Available Rooms ===");

        // Check each room type
        displayIfAvailable("Single", new singleroom());
        displayIfAvailable("Double", new doubleroom());
        displayIfAvailable("Suite", new suite());
    }

    // Helper method (defensive check)
    private void displayIfAvailable(String type, room roomObj) {

        int available = inventory.getAvailability(type);

        // Only show if available > 0
        if (available > 0) {
            System.out.println("\n" + type + " Room:");
            roomObj.displayRoomDetails();
            System.out.println("Available: " + available);
        }
    }
}

