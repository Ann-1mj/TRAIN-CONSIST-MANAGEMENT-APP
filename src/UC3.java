import java.util.HashSet;
import java.util.Set;

public class UC3 {
    public static void main(String[] args) {

        System.out.println("=== Unique Bogie ID Management ===");

        // Create HashSet
        Set<String> bogieSet = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieSet.add("B1");
        bogieSet.add("B2");
        bogieSet.add("B3");
        bogieSet.add("B2"); // duplicate
        bogieSet.add("B1"); // duplicate

        // Display unique bogies
        System.out.println("Unique bogie IDs: " + bogieSet);
    }
}