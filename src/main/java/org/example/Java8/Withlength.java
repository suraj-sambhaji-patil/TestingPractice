package org.example.Java8;

import java.util.Comparator;
import java.util.List;

public class Withlength {
    public static void main(String[] args) {

        List<String> li = List.of("selenium","java","nodeja","aaaa");


        li.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);

    }
}
