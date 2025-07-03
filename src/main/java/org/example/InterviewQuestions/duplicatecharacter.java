package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class duplicatecharacter {
    public static void main(String[] args) {

        String sp = "suraj sambhaji pati";

    /*  List<Character>ss = sp.chars().mapToObj(s->(char)s).distinct().collect(Collectors.toList());

      System.out.println(ss);*/
        List<Character> charList = new ArrayList<>();
        List<Character> duplicateList = new ArrayList<>();

        for(Character ch:sp.toCharArray()){
            if (charList.contains(ch) && !duplicateList.contains(ch) ) {
                duplicateList.add(ch);

            } else {
                charList.add(ch);
            }


        }System.out.println(duplicateList);

    }



}
