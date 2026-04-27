import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // Create HashMap to store bogie and capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        // Display all entries using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> " + capacity + " seats");
        }

        // Example: Fast lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper") + " seats");
    }
}
