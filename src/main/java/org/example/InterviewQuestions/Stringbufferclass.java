package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stringbufferclass {
    public static void main(String[] args) {

        String sp = "suraj sambhaji patil ";

   List<String>origenal = new ArrayList<>();
        List<String>duplicate = new ArrayList<>();

        for (Character ss : sp.toCharArray()) {
            if (origenal.contains(ss) && !duplicate.contains(ss)) {
                duplicate.add(ss + "");
            } else {
                origenal.add(ss + "");
            }
        }System.out.println("Original Characters: " + origenal);


    }
}
