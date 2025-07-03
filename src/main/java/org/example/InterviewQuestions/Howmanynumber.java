package org.example.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Howmanynumber {
    public static void main(String[] args) {


        int[] numbers = {12, 9, 13, 4, 6, 2, 4, 12, 15};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times");
        }











    }



}
