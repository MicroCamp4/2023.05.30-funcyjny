package pl.comarch.szkolenia.strumienie;

import pl.comarch.szkolenia.sortowanie.Car;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 200));
        cars.add(new Car("Audi", "A3", 300));
        cars.add(new Car("Toyota", "Corolla", 400));
        cars.add(new Car("Kia", "Ceed", 500));

        cars.stream()
                .peek(c -> c.setModel("X"))
                .forEach(c -> System.out.println(c));

        System.out.println(cars);
    }
}
