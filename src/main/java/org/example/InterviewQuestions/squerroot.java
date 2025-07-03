package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class squerroot {

    public static void main(String[] args) {



        List<Integer> squareRoots = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,7,8,9,10));

       // squareRoots.stream().map(s->s*s).forEach(System.out::println);

      //  squareRoots.stream().map(s->s*s).sorted(Comparator.reverseOrder()).forEach(System.out::println);

       long duplicate =  squareRoots.stream().filter(s->s.equals(3)).count();

        System.out.println("Duplicate count of 3 is: " + duplicate);





    }

}
