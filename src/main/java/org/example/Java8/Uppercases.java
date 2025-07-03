package org.example.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercases {
    public static void main(String[] args) {

        List<String>li = List.of("suraj", "sambhaji","patil");

        List<String> li2 = new ArrayList<>();

        for(String ss :li){
            li2.add(ss.substring(0, 1).toUpperCase() + ss.substring(1));


        }System.out.println(li2);

    }
}
