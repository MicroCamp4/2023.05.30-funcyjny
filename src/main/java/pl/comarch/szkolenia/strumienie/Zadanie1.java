package pl.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 9, 3, 2, 6, 4, 5, 5, 4, 6, 7, 8, 9);

        /*List<Integer> result = new ArrayList<>();
        for(int element : list) {
            if(element > 3 && element < 7 && !result.contains(element)) {
                result.add(element);
            }
        }
        System.out.println(result);*/

        List<Integer> result = list.stream().parallel()
                .filter(i -> i > 3)
                .filter(i -> i < 7)
                .distinct()
                .toList();

        System.out.println(result);

        int sum = list.stream()
                .mapToInt(x -> x)
                .sum();

        System.out.println(sum);
    }
}
