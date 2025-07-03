package org.example.Java8;

import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {

        sortedallnumber(List.of(1,4,6,8,3,5));

    }

    private static void sortedallnumber(List<Integer> integers) {
        integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
