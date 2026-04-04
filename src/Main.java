import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Custom Bogie Class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC7 - Sort Bogies by Capacity         ");
        System.out.println("===========================================\n");

        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("AC Chair", 56));

        System.out.println("Before Sorting:");
        System.out.println(passengerBogies);

        // Sorting by capacity using a Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }
    }
}