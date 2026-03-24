package UC3;
import java.util.HashMap;

public class RoomInventory {private HashMap<String, Integer> availability;

    // Constructor
    public RoomInventory() {
        availability = new HashMap<>();

        // Initialize inventory
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    // Get availability of a specific room type
    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        availability.put(roomType, count);
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("=== Room Inventory ===");

        for (String roomType : availability.keySet()) {
            System.out.println(roomType + " Rooms Available: " + availability.get(roomType));
        }
    }
}

