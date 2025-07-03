package org.example.InterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reversedorder {
    public static void main(String[] args) {
/*
        List<Integer> li = List.of(8,7,6,5,4,3,2,1);


        Collections.sort(li.reversed());

        System.out.println(li);
        */

        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50);
     /*   Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);*/




        for (int i = li.size() - 1; i >= 0; i--){
            System.out.println(li.get(i));
        }
    }
}
