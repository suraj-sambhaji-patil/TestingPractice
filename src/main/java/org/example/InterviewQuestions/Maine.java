package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Maine {
    public static void main(String[] args) {
        String sp = "suraj sambhaji patil";
        List<Character> charList = new ArrayList<>();
        List<Character> duplicateList = new ArrayList<>();

        // Add characters to list and check for duplicates
        for (char ch : sp.toCharArray()) {
            if (charList.contains(ch) && !duplicateList.contains(ch) && ch != ' ') {
                duplicateList.add(ch);
            } else {
                charList.add(ch);
            }
        }

        System.out.println("Duplicate characters: " + duplicateList);
    }
}