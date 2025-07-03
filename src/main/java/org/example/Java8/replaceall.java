package org.example.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class replaceall {
    public static void main(String[] args) {

List<String> li = List.of("suraj", "sambhaji", "patil");

       li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);



    }
}
