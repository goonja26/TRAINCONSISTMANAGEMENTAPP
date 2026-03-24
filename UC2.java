import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== UC2: Bogie Management ===");

        // Create ArrayList
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Bogies after addition: " + bogies);

        // Remove bogie
        bogies.remove("AC Chair");
        System.out.println("Bogies after removal: " + bogies);

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        System.out.println("Final bogie list: " + bogies);
    }
}