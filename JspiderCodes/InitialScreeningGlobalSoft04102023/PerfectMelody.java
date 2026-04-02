package JspiderCodes.InitialScreeningGlobalSoft04102023;

import java.util.Scanner;

public class PerfectMelody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int steps = makePerfectMelody(N, A);
        System.out.println(steps);
    }

    public static int makePerfectMelody(int N, int[] A) {
        int steps = 0;
        int currentSum = 0;

        for (int i = 0; i < N - 1; i++) {
            currentSum += A[i];

            // If the current subsequence has a negative sum, we need to adjust it
            if (currentSum < 0) {
                // Find the adjustment needed to make it positive
                int adjustment = Math.abs(currentSum);

                // Adjust the notes to make the sum positive
                A[i] += adjustment;
                A[i + 1] -= adjustment;

                steps += adjustment;
            }
        }

        // Check if the final sum is positive
        currentSum += A[N - 1];
        if (currentSum < 0) {
            return -1; // If the final sum is still negative, no solution is possible.
        }

        return steps;
    }
}
//5
//13
//-3
//-4
//-5
//62
//op - 2