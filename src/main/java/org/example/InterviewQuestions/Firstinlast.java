package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Firstinlast {
    public static void main(String[] args) {

        String sp = "suraj patil sambhaji";

     List<String> ss = new ArrayList<>(List.of(sp.split(" ")));

     ss.stream().map(s->s.replace(s.charAt(0), s.charAt(s.length()-1))).map(s -> s.replace(s.charAt(s.length() - 1), s.charAt(0)))
             .forEach(System.out::println);





    }

}
