package org.example.Java8;

import java.util.Comparator;
import java.util.List;

public class Reversedtwo {
    public static void main(String[] args) {

        List<Integer>li= List.of(9,8,7,6,5,4,3,2,1);

        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //li.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

    }
}
