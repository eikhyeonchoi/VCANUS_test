package p3;

public class Factorial {
    public static int get(int value) {
        if (value == 1) {
            return 1;
        }

        return value * get(value - 1);
    }
}
