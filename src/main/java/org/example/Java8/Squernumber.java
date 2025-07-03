package org.example.Java8;

import java.util.List;

public class Squernumber {

    public static void main(String[] args) {
        List<Integer>li = List.of(2,3,4,5,6,7);

        spuerutofnumber(li);
    }

    private static void spuerutofnumber(List<Integer> li) {

        li.stream().map(lis->lis*lis*lis).forEach(System.out::println);
    }
}
