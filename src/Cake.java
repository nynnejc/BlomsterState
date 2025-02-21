class Cake {
    private String flavor;
    private double price;

    // Constructor
    public Cake(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    // Getter til smag
    public String getFlavor() {
        return flavor;
    }

    // Setter til smag
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter til pris
    public double getPrice() {
        return price;
    }

    // Setter for pris med simpel validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Prisen skal være positiv!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Cake object
        Cake cake = new Cake("chocolade", 34.99);

        // Vis initial values
        System.out.println("Kagen er med: " + cake.getFlavor() + " smag.");
        System.out.println("Cake Price: $" + cake.getPrice());

        // Sæt ny værdier (state) med setters
        cake.setFlavor("Jordbær");
        cake.setPrice(42.50);

        // Print den nye værdi / state
        System.out.println("Updated Cake Flavor: " + cake.getFlavor());
        System.out.println("Updated Cake Price: $" + cake.getPrice());
    }
}
