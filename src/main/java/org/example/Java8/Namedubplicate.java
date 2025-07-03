package org.example.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Namedubplicate {
    public static void main(String[] args) {

        String sp = "suraj sambhaji patil";

        char[] ch = sp.toCharArray();

        List<Character>li = sp.chars().mapToObj(a->(char) a).distinct().collect(Collectors.toList());

       //System.out.println(li);

        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

System.out.print(li);



    }
}
