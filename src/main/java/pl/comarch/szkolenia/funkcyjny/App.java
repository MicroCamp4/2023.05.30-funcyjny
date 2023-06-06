package pl.comarch.szkolenia.funkcyjny;

import pl.comarch.szkolenia.sortowanie.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> Integer.parseInt(s) * 5;

        System.out.println(function.apply("5"));
        System.out.println(function.apply("7"));
        System.out.println(function.apply("28"));
        System.out.println(function.apply("59"));

        UnaryOperator<Integer> unaryOperator = i -> i * 10 - 15;

        System.out.println(unaryOperator.apply(4));
        System.out.println(unaryOperator.apply(17));
        System.out.println(unaryOperator.apply(0));

        BiFunction<Integer, String, Boolean> biFunction =
                (i, s) -> (i * 100 + s).length() > 10;

        System.out.println(biFunction.apply(15, "asdk"));
        System.out.println(biFunction.apply(1, "iolujhgsadkl"));
        System.out.println(biFunction.apply(0, "jkzxhcbhjks"));

        Predicate<String> predicate = s -> (s + "ABC").length() > 7;

        System.out.println(predicate.test("asdfas"));
        System.out.println(predicate.test("Adfa"));
        System.out.println(predicate.test("kjahsgdjkhkahjs"));
        System.out.println(predicate.test("a"));

        Supplier<Car> defaultCarSupplier =
                () -> new Car("default", "default", 0);

        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car());
        consumer.accept(defaultCarSupplier.get());
        consumer.accept(new Car("Ferrari", "Italia", 1000));

        SuperFunkcja superFunkcja = (a,b,c) -> System.out.println(a + b * c);
        superFunkcja.apply(3,5,9);

        SuperFunkcja superFunkcja2 = (a,b,c) -> {
            for(int i = a; i < b; i++) {
                System.out.println(c);
            }
        };

        superFunkcja2.apply(3,7,12);

        int x = 5;
        UnaryOperator<String> stringUnaryOperator = s -> (s.length() + x) + "";

        UnaryOperator<String> stringUnaryOperator2 =
                new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return (s.length() + x) + "";
            }
        };

        System.out.println(stringUnaryOperator.apply("asdfasd"));
        //x = 10;
        System.out.println(stringUnaryOperator.apply("asdfasd"));
    }
}
