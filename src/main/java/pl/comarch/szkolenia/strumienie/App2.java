package pl.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,8,3,2,4,5,9,6,7,7,8,9);

        list.stream()
                .distinct()
                .peek(System.out::println)
                .filter(i -> i > 3)
                .filter(i -> i < 7)
                .parallel()
                .peek(System.out::println)
                .limit(2)
                .forEach(i -> System.out.println(i));

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1,2,3,4));
        listOfLists.add(Arrays.asList(5,6,7,8));
        listOfLists.add(Arrays.asList(9,10,11,12));

        List<Integer> result = listOfLists.stream()
                .flatMap(l -> {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(l.get(0));
                    innerList.add(l.get(1));
                    return innerList.stream();
                })
                .toList();
        System.out.println(result);
    }
}
