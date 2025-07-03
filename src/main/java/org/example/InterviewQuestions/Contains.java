package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Contains {
    public static void main(String[] args) {

        String sp = "suraj sambhaji patil";

     /*   List<Character>li = sp.chars().mapToObj(s->(char)s).distinct().collect(Collectors.toList());

        System.out.println(li);*/

        List<Character>or = new ArrayList<>();
        List<Character>dup = new ArrayList<>();

        for(Character ss:sp.toCharArray()){
            if(or.contains(ss) && !dup.contains(ss)){
                dup.add(ss);
            }else {
                or.add(ss);
            }
        }System.out.println(dup);




    }
}
