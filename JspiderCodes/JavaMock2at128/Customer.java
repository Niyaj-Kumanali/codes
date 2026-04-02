package JspiderCodes.JavaMock2at128;

import java.util.Scanner;

public class Customer {
    String name;
    int age;
    String address;
    long phoneNumber;
    String email;

    public Customer() {
    }

    public Customer(String name, int age, String address, long phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public static String getName(Scanner sc) {
        return sc.nextLine();
    }

    public static int getAge(Scanner sc) {
        return sc.nextInt();
    }

    public static String getAddress(Scanner sc) {
        return sc.nextLine();
    }

    public static long getPhoneNumber(Scanner sc) {
        return sc.nextLong();
    }
    public static String getEmail(Scanner sc) {
        return sc.nextLine();
    }

    public void customerDetails(){
        System.out.println("\n_______________________________");
        System.out.println("Customer Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: "+ getAddress());
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = getName(sc);

        System.out.print("Enter age: ");
        int age = getAge(sc);
        sc.nextLine();

        System.out.print("Enter email: ");
        String email = getEmail(sc);

        System.out.print("Enter phone number: ");
        long phoneNumber = getPhoneNumber(sc);
        sc.nextLine();

        System.out.print("Enter address: ");
        String address = getAddress(sc);

        Customer customer = new Customer(name, age, address, phoneNumber, email);
        customer.customerDetails();
        sc.close();
    }
}

