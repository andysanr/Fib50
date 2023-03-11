public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            long result = f(i);
            System.out.println("Fib " + i + " = " + result);
        }
    }

    public static long f(int n) {
        if
            (n == 0) return 0;

        else if
            (n == 1) return 1;

        else
            return f(n - 1) + f(n - 2);
    }
}
