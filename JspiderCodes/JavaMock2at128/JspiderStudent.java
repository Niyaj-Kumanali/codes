package JspiderCodes.JavaMock2at128;

import java.util.Scanner;

public class JspiderStudent {
    String name;
    String degree;
    String email;
    long phoneNumber;

    public JspiderStudent(String name, String degree, String email, long phoneNumber) {
        this.name = name;
        this.degree = degree;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public static String getName(Scanner sc) {
        return sc.nextLine();
    }

    public static String getDegree(Scanner sc) {
        return sc.nextLine();
    }

    public static String getEmail(Scanner sc) {
        return sc.nextLine();
    }

    public static long getPhoneNumber(Scanner sc) {
        return sc.nextLong();
    }

    public static char getChoice(Scanner sc) {
        return sc.next().toLowerCase().charAt(0);
    }

    public static JspiderStudent getDetailsUsingEmail(Scanner sc){
        System.out.print("Enter student name: ");
        String name = getName(sc);

        System.out.print("Enter student degree: ");
        String degree = getDegree(sc);

        System.out.print("Enter student's email: ");
        String email = getEmail(sc);

        return new JspiderStudent(name, degree, email, 0);
    }
    public static JspiderStudent getDetailsUsingPhoneNumber(Scanner sc){
        System.out.print("Enter student name: ");
        String name = getName(sc);

        System.out.print("Enter student degree: ");
        String degree = getDegree(sc);

        System.out.print("Enter student's phone number: ");
        long phoneNumber = getPhoneNumber(sc);
        sc.nextLine();
        return new JspiderStudent(name, degree, null, phoneNumber);
    }

    public void studentDetails() {
        System.out.println("\n_______________________________________");
        System.out.println("Enrolled Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Degree: " + getDegree());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want enroll using phone number or email?");
        System.out.print("Press (e) to enroll using email or Press (p) to enroll using phone number :");
        int choice = getChoice(sc);
        sc.nextLine();

        JspiderStudent student;
        if (choice == 'e') {
            student = getDetailsUsingEmail(sc);
            student.studentDetails();
        } else if (choice == 'p') {
            student = getDetailsUsingPhoneNumber(sc);
            student.studentDetails();
        } else {
            System.out.println("Invalid choice....!!!!!!!");
        }

        sc.close();
    }
}

