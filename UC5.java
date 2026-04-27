import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper"); // This will be ignored

        // Display final train formation
        System.out.println("Final Train Formation (No Duplicates, Order Preserved):");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
