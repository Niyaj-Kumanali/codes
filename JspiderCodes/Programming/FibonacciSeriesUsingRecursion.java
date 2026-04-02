package JspiderCodes.Programming;

public class FibonacciSeriesUsingRecursion {
    public static void fibSeries(int a, int b, int limit) {
        if (a > limit) {
            System.out.println();
            return;
        }
        System.out.print(a + " ");
        fibSeries(b, a + b, limit);
    }

    public static void fibSeriesInRange(int a, int b, int range) {
        if (range <= 0){
            System.out.println();
            return;
        }
        System.out.print(a + " ");
        fibSeries(b, a + b, --range);
    }

    public static int fib(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int next = fib(n-1)+fib(n-2);
        System.out.print(next+" ");
        return next;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        fibSeries(a, b, 50);
        fibSeriesInRange(a, b, 10);
        fib(10);
        System.out.println();

        while(a < 50){
            System.out.print(a + " ");
            int next = b;
            b = a+b;
            a = next;
        }
    }
}
