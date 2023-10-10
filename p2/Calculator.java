package p2;

public class Calculator {
    int value;

    public Calculator() {
        value = 0;
    }

    public Calculator add(int value) {
        this.value += value;
        return this;
    }

    public Calculator subtract(int value) {
        this.value -= value;
        return this;
    }

    public int out() {
        return value;
    }
}
