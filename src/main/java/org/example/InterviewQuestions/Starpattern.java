package org.example.InterviewQuestions;

public class Starpattern {

    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {

            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
