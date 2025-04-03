abstract class Product {
    public abstract double getPrice();
    public abstract String getDescription();
}

interface Discountable {
    double getDiscount();
}

class Electronics extends Product implements Discountable {
    private String name;
    private double price;
    private double discount;

    public Electronics(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}

class Books extends Product {
    private String title;
    private double price;

    public Books(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + title;
    }
}

class Clothing extends Product implements Discountable {
    private String brand;
    private double price;
    private double discount;

    public Clothing(String brand, double price, double discount) {
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + brand;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Electronics("Laptop", 1000.0, 10.0);
        Product product2 = new Books("Java Programming", 50.0);
        Product product3 = new Clothing("Nike T-shirt", 30.0, 15.0);

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