import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create train list
        List<String> train = new ArrayList<>();

        // ADD bogies
        train.add("Sleeper");
        train.add("AC Chair");
        train.add("First Class");

        // Display after adding
        System.out.println("After adding bogies: " + train);

        // REMOVE a bogie
        train.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair: " + train);

        // CHECK existence
        boolean exists = train.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // Final state
        System.out.println("Final train consist: " + train);
    }
}
