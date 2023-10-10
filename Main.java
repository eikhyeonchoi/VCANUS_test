import p1.Bread;
import p1.BreadFactory;
import p2.Calculator;
import p3.Factorial;
import p4.TailFactorial;
import p5.Pond;

public class Main {
    public static void main(String[] args) {
        // java 17 에서 수행

        // 문제 1
        // resultOfP1();

        // 문제 2
        // resultOfP2();

        // 문제 3
        // resultOfP3();

        // 문제 4
        // resultOfP4();

        // 문제 5
        resultOfP5();
    }

    private static void resultOfP1() {
        Bread cream = BreadFactory.getBread("cream", 100, 100, 200);
        Bread sugar = BreadFactory.getBread("sugar", 100, 100, 200);
        Bread butter = BreadFactory.getBread("butter", 100, 100, 50);

        Bread[] breads = new Bread[]{cream, sugar, butter};
        for (Bread bread : breads) {
            System.out.println(bread);
        }
    }

    private static void resultOfP2() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result);
    }

    private static void resultOfP3() {
        int result = Factorial.get(4);
        System.out.println(result);
    }

    private static void resultOfP4() {
        int result = TailFactorial.get(1000000);
        System.out.println(result);
    }

    private static void resultOfP5() {
        Pond pond = new Pond();
        pond.show();
    }
}
