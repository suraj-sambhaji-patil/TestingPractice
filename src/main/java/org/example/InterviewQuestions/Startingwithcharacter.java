package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Startingwithcharacter {
    public static void main(String[] args) {
        List<String>li = new ArrayList<>(Arrays.asList("suraj","amit","shain","shilpa"));
int count = 0;
        for(int i = 0; i<li.size();i++){
            if(li.get(i).charAt(0)=='s'){
                System.out.println(li.get(i));
                count++;
            }
        }System.out.println(count);

    }



}
