import java.util.LinkedList;

public class UC4 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist using LinkedList ===");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial train: " + train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2: " + train);

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("Final train consist: " + train);
    }
}