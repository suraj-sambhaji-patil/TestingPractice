package org.example.Java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class eveenandsqured {
    public static void main(String[] args) {

        List<Integer>li= List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> doublesqure = Evennumversquer(li);

        System.out.println(doublesqure);







      //  List<Integer> evenNumber = li.stream().filter(list->list%2==0).collect(Collectors.toList());


    }

    private static List<Integer> Evennumversquer(List<Integer> li) {

        return li.stream().filter(lis->lis%2==0).map(more->more*more).collect(Collectors.toList());
    }


}
