package org.example.Java8;

import java.util.List;

public class Courses {
    public static void main(String[] args) {

        List<String>  li = List.of("selenium","java","nodeja","aaaa");

      //  li.stream().forEach(System.out::println);

      //  li.stream().filter(lis-> lis.contains("java")).forEach(System.out::println);

       // li.stream().filter(lis->lis.length()>=4).forEach(System.out::println);

        li.stream().map(lis->lis+" - " +lis.length()).forEach(System.out::println);

    }



}
