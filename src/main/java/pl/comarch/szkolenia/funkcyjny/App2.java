package pl.comarch.szkolenia.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        System.out.println(readFromDbAndCalculate1());

        System.out.println(readAndCalculate(App2::readFromFile, App2::calculate2));
        System.out.println(readAndCalculate(App2::readFromDb, App2::calculate3));
        System.out.println(readAndCalculate(App2::readFromFile, App2::calculate1));

    }

    public static int readFromDb() {
        return 5;
    }

    public static int readFromFile() {
        return 7;
    }

    public static int calculate1(int x) {
        return x * 5;
    }

    public static int calculate2(int x) {
        return x * 8;
    }

    public static int calculate3(int x) {
        return x * 15;
    }

    public static int readFromDbAndCalculate1() {
        int x = readFromDb();
        return calculate1(x);
    }

    public static int readAndCalculate(Supplier<Integer> reader,
                                       UnaryOperator<Integer> calculator) {
        int x = reader.get();
        return calculator.apply(x);
    }
}
