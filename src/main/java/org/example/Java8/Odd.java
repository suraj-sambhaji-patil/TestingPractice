package org.example.Java8;

import java.util.List;

public class Odd {
    public static void main(String[] args) {

        List<Integer>num = List.of(12,23,12,4,67,5);
        oddnumber(num);

    }

    private static void oddnumber(List<Integer> num) {
        num.stream().filter(number->number%2==1).forEach(System.out::println);
    }
}
