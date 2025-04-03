// Abstract Product class
abstract class Product {
    // Abstract method for price
    public abstract double getPrice();
    
    // Abstract method for description
    public abstract String getDescription();
}

// Discountable interface
interface Discountable {
    double getDiscount(); // Method to get discount
}

// Electronics class (inherits from Product and implements Discountable)
class Electronics extends Product implements Discountable {
    private String name;
    private double price;
    private double discount;

    public Electronics(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Implement the getPrice() method
    @Override
    public double getPrice() {
        return price;
    }

    // Implement the getDescription() method
    @Override
    public String getDescription() {
        return "Electronics: " + name;
    }

    // Implement the getDiscount() method from Discountable interface
    @Override
    public double getDiscount() {
        return discount;
    }
}

// Books class (inherits from Product but does not implement Discountable)
class Books extends Product {
    private String title;
    private double price;

    public Books(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Implement the getPrice() method
    @Override
    public double getPrice() {
        return price;
    }

    // Implement the getDescription() method
    @Override
    public String getDescription() {
        return "Book: " + title;
    }
}

// Clothing class (inherits from Product and implements Discountable)
class Clothing extends Product implements Discountable {
    private String brand;
    private double price;
    private double discount;

    public Clothing(String brand, double price, double discount) {
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    // Implement the getPrice() method
    @Override
    public double getPrice() {
        return price;
    }

    // Implement the getDescription() method
    @Override
    public String getDescription() {
        return "Clothing: " + brand;
    }

    // Implement the getDiscount() method from Discountable interface
    @Override
    public double getDiscount() {
        return discount;
    }
}

// Main class to test the implementation
public class Discountable1 {
    public static void main(String[] args) {
        // Create instances of each product
        Product product1 = new Electronics("Laptop", 1000.0, 10.0);
        Product product2 = new Books("Java Programming", 50.0);
        Product product3 = new Clothing("Nike T-shirt", 30.0, 15.0);

        // Print details for each product
        System.out.println(product1.getDescription() + " - Price: $" + product1.getPrice());
        if (product1 instanceof Discountable) {
            System.out.println("Discount: " + ((Discountable) product1).getDiscount() + "%");
        }

        System.out.println("\n" + product2.getDescription() + " - Price: $" + product2.getPrice());

        System.out.println("\n" + product3.getDescription() + " - Price: $" + product3.getPrice());
        if (product3 instanceof Discountable) {
            System.out.println("Discount: " + ((Discountable) product3).getDiscount() + "%");
        }
    }
}
