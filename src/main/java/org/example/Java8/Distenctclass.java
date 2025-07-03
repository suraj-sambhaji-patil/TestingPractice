package org.example.Java8;

import java.util.List;

public class Distenctclass {
    public static void main(String[] args) {

        printdistinctnumber(List.of(2,3,4,56,6,6,6,63,3,3,3));

    }

    private static void printdistinctnumber(List<Integer> integers) {
        integers.stream().distinct().forEach(System.out::println);


    }
}
