package org.example.Java8;

import java.util.List;

public class addition {
    public static void main(String[] args) {


        List<Integer>li = List.of(2,3,4,5,6,7);

       int sum =  additioncreate(li);

        System.out.println(sum);

    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int additioncreate(List<Integer> li) {
        return li.stream().reduce(0,addition::add);
    }
}
