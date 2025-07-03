package org.example.Java8;

import java.util.List;
import java.util.stream.IntStream;

public class Instream {
    public static void main(String[] args) {

     //   IntStream.iterate(1, a->a+1).limit(20).forEach(System.out::println);

        // IntStream.iterate(2, a->a+2).limit(10).peek((System.out::println)).sum();

        IntStream.iterate(2, a->a*2).limit(10).peek((System.out::println)).sum();
    }



}
