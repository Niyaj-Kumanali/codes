package JspiderCodes.JavaMock2at128;

import java.util.Scanner;

public class Product {
    static int nextProductId = 1;

    final int productId;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productId = nextProductId++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static String getProductName(Scanner sc) {
        return sc.nextLine();
    }

    public static double getPrice(Scanner sc) {
        return sc.nextDouble();
    }

    public static int getQuantity(Scanner sc) {
        return sc.nextInt();
    }

    public void displayProductDetails() {
        System.out.println("\n________________________________");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: Rs " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Products : ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] product = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter product" + (i + 1) + " name: ");
            String productName = getProductName(sc);

            System.out.print("Enter product" + (i + 1) + " price: ");
            double price = getPrice(sc);

            System.out.print("Enter product" + (i + 1) + " quantity: ");
            int quantity = getQuantity(sc);
            sc.nextLine();

            product[i] = new Product(productName, price, quantity);
        }

        System.out.println("Product Details:");
        for (int i = 0; i < n; i++) {
            product[i].displayProductDetails();
        }

        sc.close();
    }
}

