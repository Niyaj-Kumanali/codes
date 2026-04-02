package JspiderCodes.JavaMock1;

import java.util.Scanner;

public class pgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee : ");
        int emps = sc.nextInt();

        System.out.println("___________________________________________________________");
        double[] empSal = new double[emps];
        for (int i = 0; i < empSal.length; i++) {
            System.out.println("Enter the salary of Employee"+(i+1)+" : ");
            empSal[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.println("___________________________________________________________");
        int[] empPerf = new int[emps];
        for (int i = 0; i < empSal.length; i++) {
            System.out.println("Enter the Rating of Employee"+(i+1)+" : ");
            empPerf[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("___________________________________________________________");
        System.out.println("The Detals of Employees with their bonus are :");

        calcBonus(empSal, empPerf);

        sc.close();
    }

    public static void calcBonus(double[] empSal, int[] empPerf){
        for (int i = 0; i < empSal.length; i++) {
            double bonus = 0;
            if(empPerf[i] == 5){
                bonus = empSal[i] + (empSal[i]*0.5);
                System.out.println("The bonus for employee "+(i+1)+" is "+bonus);
            }
            else if(empPerf[i] == 4){
                bonus = empSal[i] + (empSal[i]*0.4);
                System.out.println("The bonus for employee "+(i+1)+" is "+bonus);
            }
            else if(empPerf[i] == 3){
                bonus = empSal[i] + (empSal[i]*0.3);
                System.out.println("The bonus for employee "+(i+1)+" is "+bonus);
            }
            else if(empPerf[i] == 2){
                bonus = empSal[i] + (empSal[i]*0.2);
                System.out.println("The bonus for employee "+(i+1)+" is "+bonus);
            }
            else {
                bonus = empSal[i] + (empSal[i]*0.1);
                System.out.println("The bonus for employee "+(i+1)+" is "+bonus);
            }

        }
    }
}
