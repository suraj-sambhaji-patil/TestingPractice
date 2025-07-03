package org.example.Java8;

import java.util.List;

public class Lamdaeven {

    public static void main(String[] args) {
    List<Integer>numbers = List.of(12,3,4,6,12);
        Allprinumberseven(numbers);


    }

    private static void Allprinumberseven(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }


}
