package org.example.Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortedwithlength {
    public static void main(String[] args) {

        List<String> li = List.of("selenium","java","nodeja","aaaa");

      //  li.stream().map(lis->lis.length()).forEach(System.out::println);

     //   li.stream().map(lis->lis.length()).collect(Collectors.toList()).forEach(System.out::println);

     //   li.stream().map(m->m.length()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        li.stream().forEach(lis -> {
            System.out.println(lis + " : " + lis.length());
        });

    }
}
