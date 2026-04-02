package JspiderCodes.JavaMock2at128;

import java.util.Scanner;

public class Car {
    String brandName;
    String engineType;
    String fuelType;
    int seatingCapacity;
    String model;

    public Car(String brandName, String engineType, String fuelType, int seatingCapacity, String model) {
        this.brandName = brandName;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public static String getBrandName(Scanner sc) {
        return sc.nextLine();
    }

    public static String getEngineType(Scanner sc) {
        return sc.nextLine();
    }

    public static String getFuelType(Scanner sc) {
        return sc.nextLine();
    }

    public static int getSeatingCapacity(Scanner sc) {
        return sc.nextInt();
    }

    public static String getModel(Scanner sc) {
        return sc.nextLine();
    }

    public static char getResponse(Scanner sc) {
        return sc.next().toLowerCase().charAt(0);
    }

    public void updateCar(Scanner sc) {
        System.out.print("Enter updated brand name: ");
        brandName = getBrandName(sc);

        System.out.print("Enter updated engine type: ");
        engineType = getEngineType(sc);

        System.out.print("Enter updated fuel type: ");
        fuelType = getFuelType(sc);

        System.out.print("Enter updated seating capacity: ");
        seatingCapacity = getSeatingCapacity(sc);
        sc.nextLine();

        System.out.print("Enter updated model: ");
        model = getModel(sc);
    }

    public void catDetails() {
        System.out.println("\n_______________________________________________");
        System.out.println("Car Details:");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Engine Type: " + getEngineType());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Seating Capacity: " + getSeatingCapacity());
        System.out.println("Model: " + getModel());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand name: ");
        String brandName = getBrandName(sc);

        System.out.print("Enter engine type: ");
        String engineType = getEngineType(sc);

        System.out.print("Enter fuel type: ");
        String fuelType = getFuelType(sc);

        System.out.print("Enter seating capacity: ");
        int seatingCapacity = getSeatingCapacity(sc);
        sc.nextLine();

        System.out.print("Enter model: ");
        String model = getModel(sc);

        Car car = new Car(brandName, engineType, fuelType, seatingCapacity, model);

        car.catDetails();

        System.out.println("Do you want to update car details(y/n) : ");
        char response = getResponse(sc);
        if (response == 'y') {
            sc.nextLine();
            car.updateCar(sc);
            car.catDetails();
        } else {
            System.out.println(".....Thank you....:)");
        }
        sc.close();
    }
}

