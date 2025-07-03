package org.example.InterviewQuestions;

public class ReversedString {

    public static void main(String[] args) {

        String sp = "suraj sambhaji patil";

        String [] words = sp.split(" ");
        StringBuilder result = new StringBuilder();


        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        // Print the final reversed string
        System.out.println(result.toString().trim());



    }
}
