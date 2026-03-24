package UC3;

public class UseCase3HotelBookingApp {public static void main(String[] args) {

    // Initialize inventory
    RoomInventory inventory = new RoomInventory();

    // Display current inventory
    inventory.displayInventory();

    // Example update (simulate booking)
    System.out.println("\nBooking a Single Room...");

    int current = inventory.getAvailability("Single");
    inventory.updateAvailability("Single", current - 1);

    // Display updated inventory
    System.out.println("\nUpdated Inventory:");
    inventory.displayInventory();
}
}
