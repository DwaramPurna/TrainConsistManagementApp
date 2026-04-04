import java.util.ArrayList;
import java.util.List;

// 1. Define GoodsBogie with Type and Cargo attributes
class GoodsBogie {
    String type; // e.g., "Cylindrical", "Open", "Box"
    String cargo; // e.g., "Petroleum", "Coal", "Grain"

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " [" + cargo + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   UC12 - Safety Compliance Check        ");
        System.out.println("===========================================\n");

        // 2. Setup a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        // Uncomment the line below to test a safety violation:
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Current Goods Consist: " + goodsConsist);

        // 3. Apply Safety Rule:
        // IF type is "Cylindrical", cargo MUST be "Petroleum".
        // Others can have any cargo.
        boolean isTrainSafe = goodsConsist.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are always considered safe here
        });

        // 4. Display Safety Status
        System.out.println("\n--- SAFETY REPORT ---");
        if (isTrainSafe) {
            System.out.println("STATUS: SAFE ✅");
            System.out.println("All cylindrical bogies are carrying authorized cargo.");
        } else {
            System.out.println("STATUS: UNSAFE ❌");
            System.out.println("DANGER: Unauthorized cargo detected in Cylindrical bogies!");
        }

        System.out.println("\nUC12: Safety validation completed.");
    }
}