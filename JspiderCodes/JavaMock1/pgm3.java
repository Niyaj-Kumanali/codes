package JspiderCodes.JavaMock1;

import java.util.Scanner;

public class pgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects : ");
        int subjects = sc.nextInt();

        double[] marks = new double[subjects];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for subject "+(i+1)+" : ");
            marks[i] = sc.nextDouble();
        }

        calcGrade(marks);

        sc.close();

    }

    public static void calcGrade(double[] marks){
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] >= 80){
                System.out.println(marks[i]+"---->Excellent");
            }
            else if(marks[i] >= 70){
                System.out.println(marks[i]+"---->Very Good");
            }
            else if(marks[i] >= 60){
                System.out.println(marks[i]+"---->Good");
            }
            else
                System.out.println(marks[i]+"---->BAD");
        }
    }
}
