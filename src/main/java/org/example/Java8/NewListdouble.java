package org.example.Java8;

import java.util.List;
import java.util.stream.Collectors;



public class NewListdouble {

    public static void main(String[] args) {
        List<Integer>li = List.of(1,2,3,4,5,6,7);

        List<Integer> doublenumber = dublelists(li);

        System.out.println(doublenumber);

    }

    private static List<Integer> dublelists(List<Integer> li) {
        return li.stream().map(list->list * list).collect(Collectors.toList());
    }


}
