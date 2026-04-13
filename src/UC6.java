import java.util.LinkedHashSet;

public class UC6 {
    public static void main(String[] args) {

        System.out.println("=== Train Formation using LinkedHashSet ===");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper");

        // Display final formation
        System.out.println("Final train formation: " + train);
    }
}