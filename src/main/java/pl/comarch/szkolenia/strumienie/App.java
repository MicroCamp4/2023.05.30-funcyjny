package pl.comarch.szkolenia.strumienie;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,8,3,2,4,5,9,6,7,7,8,9);

        List<String> list2 = list.stream()
                .map(i -> "Liczba: " + i)
                .toList();
        System.out.println(list2);
    }
}
