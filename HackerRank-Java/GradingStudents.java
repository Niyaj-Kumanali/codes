package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> grades= new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        System.out.println(gradingStudents(grades));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradesNew = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) < 38){
                gradesNew.add(grades.get(i));
                continue;
            }
            int prev = grades.get(i) / 5;
            int nextMultiple = prev*5 + 5;
            if(nextMultiple - grades.get(i) < 3)
                gradesNew.add(nextMultiple);
            else
                gradesNew.add(grades.get(i));
        }
        return gradesNew;
    }
}
