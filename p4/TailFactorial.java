package p4;

public class TailFactorial {
    private static TailCall factorial(final int n, final int total) {
        if (n == 1) {
            return TailCaller.done(total);
        } else {
            return TailCaller.call(() -> factorial(n - 1, n * total));
        }
    }

    public static int get(int value) {
        return factorial(value, 1).invoke();
    }
}
