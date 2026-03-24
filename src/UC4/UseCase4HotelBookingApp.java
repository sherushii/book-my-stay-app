package UC4;

public class UseCase4HotelBookingApp {

    public static void main(String[] args) {

        // Initialize inventory (same as UC3)
        RoomInventory inventory = new RoomInventory();

        // Create search service
        SearchService searchService = new SearchService(inventory);

        // Perform search (READ ONLY)
        searchService.displayAvailableRooms();
    }
}
