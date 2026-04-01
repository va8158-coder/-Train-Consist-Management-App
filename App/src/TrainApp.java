import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");
        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<String>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after adding
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("Passenger bogies after removal:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        }
        else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list
        System.out.println("Final passenger bogies list:");
        System.out.println(passengerBogies);
    }
}