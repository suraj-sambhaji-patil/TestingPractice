package org.example.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectorandadd {
    public static void main(String[] args) {

        List<String>li = List.of("java","Pring","Pring boot","aws","Javascript");

      //  System.out.println(li.stream().collect(Collectors.joining(" ")));

li.stream().map(lis->lis.split("")).flatMap(Arrays::stream).collect(Collectors.toList()).forEach(System.out::println);

        li.stream().map(lis->lis.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

    }



}
