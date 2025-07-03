package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uppercases {

    public static void main(String[] args) {

        String sp = "suraj sambhaji patil";

        String [] ch =sp.split(" ");

        List<String> li = Arrays.asList(ch);

        List<String>li2 = new ArrayList<>();

        for(String ss:li){
          //  li2.add(ss.substring(0,1).toUpperCase()+ss.substring(1));
            li2.add(ss.toUpperCase());
        }
        System.out.println(li2);




    }
}
