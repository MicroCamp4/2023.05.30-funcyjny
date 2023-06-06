package pl.comarch.szkolenia.sortowanie;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "A3", 200));
        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("Kia", "Ceed", 140));
        cars.add(new Car("BMW", "5", 400));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println(cars);

        TurboInterface t = new TurboInterface() {
            @Override
            public void a() {

            }

            @Override
            public void b() {

            }

            @Override
            public void c() {

            }
        };
        t.a();
        t.b();
        t.c();
    }
}
