import java.util.HashSet;
import java.util.Scanner;

public class UC3 {

    public static void main(String[] args) {

        // Create HashSet to store unique bogie IDs
        HashSet<String> bogieSet = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            // add() returns false if duplicate
            if (bogieSet.add(id)) {
                System.out.println("Bogie ID added successfully.");
            } else {
                System.out.println("Duplicate Bogie ID! Ignored.");
            }
        }

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String bogie : bogieSet) {
            System.out.println(bogie);
        }

        sc.close();
    }
}
