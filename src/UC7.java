import java.util.*;
import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display format
    public String toString() {
        return name + " (" + capacity + ")";
    }
}
// Main class
public class UC7 {
    public static void main(String[] args) {

        System.out.println("=== Train Bogie Sorting System ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        // Sort by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Sorted bogies by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}