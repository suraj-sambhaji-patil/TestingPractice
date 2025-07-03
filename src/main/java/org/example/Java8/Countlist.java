package org.example.Java8;

import java.util.List;
import java.util.stream.Stream;

public class Countlist {
    public static void main(String[] args) {

        List<Integer>li = List.of(1,2,3,4,5,6,7);
     //   System.out.println(Stream.of(1,2,3,4,5,6,7).count());
     //   System.out.println(Stream.of(1,2,3,4,5,6,7).reduce(0,Integer::max));
        System.out.println(Stream.of(1,2,3,4,5,6,7).reduce(0,Integer::sum));

    }
}
