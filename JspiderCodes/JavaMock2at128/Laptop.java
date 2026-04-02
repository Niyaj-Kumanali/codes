package JspiderCodes.JavaMock2at128;

import java.util.Scanner;

public class Laptop {
    static int nextLaptopNumber = 100001;
    String modelNumber;
    int yearOfManufacturing;
    String brandName;
    String modelName;
    double price;

    public Laptop(int yearOfManufacturing, String brandName, String modelName, double price) {
        this.yearOfManufacturing = yearOfManufacturing;
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }

    private String generateModelNumber() {
        return "LAP101" + yearOfManufacturing + nextLaptopNumber++;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public static String getModelNumber(Scanner sc) {
        return sc.nextLine();
    }

    public static int getYearOfManufacturing(Scanner sc) {
        return sc.nextInt();
    }

    public static String getBrandName(Scanner sc) {
        return sc.nextLine();
    }

    public static String getModelName(Scanner sc) {
        return sc.nextLine();
    }

    public static double getPrice(Scanner sc) {
        return sc.nextDouble();
    }

    public static Laptop[] sortLaptop(Laptop[] laptop){
        for ( int i=0; i< laptop.length -1; i++) {
            for (int j = i + 1; j > 0; j--)
                if (laptop[j].yearOfManufacturing < laptop[j - 1].yearOfManufacturing) {
                    Laptop temp = laptop[j];
                    laptop[j] = laptop[j - 1];
                    laptop[j - 1] = temp;
                }
        }
        for (int i = 0; i < laptop.length; i++) {
            laptop[i].modelNumber = laptop[i].generateModelNumber();
        }
        return laptop;
    }
    public void displayLaptopDetails() {
        System.out.println("________________________________");
        System.out.println("Model Number: " + getModelNumber());
        System.out.println("Year of Manufacturing: " + getYearOfManufacturing());
        System.out.println("Brand Name: " + getBrandName());
        System.out.println("Model Name: " + getModelName());
        System.out.println("Price: Rs " + getPrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Laptops : ");
        int n = sc.nextInt();
        sc.nextLine();

        Laptop[] laptop = new Laptop[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Laptop"+(i+1)+" :");
            System.out.print("Enter year of manufacturing: ");
            int yearOfManufacturing = getYearOfManufacturing(sc);
            sc.nextLine();

            System.out.print("Enter brand name: ");
            String brandName = getBrandName(sc);

            System.out.print("Enter model name: ");
            String modelName = getModelName(sc);

            System.out.print("Enter price: ");
            double price = getPrice(sc);

            sc.nextLine();

            laptop[i] = new Laptop(yearOfManufacturing, brandName, modelName, price);
        }

        laptop = sortLaptop(laptop);

        System.out.println("Laptop Details:");
        for (int i = 0; i < n; i++) {
            laptop[i].displayLaptopDetails();
        }

        sc.close();
    }
}

