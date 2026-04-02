package JspiderCodes.EmployeeList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int n = sc.nextInt();
        while (n>0) {
            sc.nextLine();
            System.out.print("Eid : ");
            int eid = sc.nextInt();
            sc.nextLine();
            System.out.print("Ename : ");
            String ename = sc.nextLine();
            System.out.print("ESal : ");
            double esal = sc.nextDouble();
            sc.nextLine();
            System.out.print("Designation :");
            String dsg = sc.nextLine();
            System.out.print("Phone Number : ");
            long phno = sc.nextLong();
            list.add(new Employee(eid, ename, esal, dsg, phno));
            n--;
        }
//        list.add(new Employee(101, "Niyaj", 35800, "SE", 87654321));
//        list.add(new Employee(102, "Shubham", 33000, "SE", 87654321));
//        list.add(new Employee(103, "Yash", 35500, "SE", 87654321));
//        list.add(new Employee(104, "Pattu", 45000, "SE", 87654321));
//        list.add(new Employee(105, "Shilpi", 45000, "SE", 87654321));

        double maxSal = list.get(0).getEsal();

        for (Employee emp : list) {
            if (maxSal < emp.getEsal()) {
                maxSal = emp.getEsal();
            }
        }

        for (Employee emp : list) {
            if (maxSal == emp.getEsal()) {
                System.out.println(emp);
            }
        }

    }
}
