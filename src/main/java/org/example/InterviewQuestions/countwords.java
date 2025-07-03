package org.example.InterviewQuestions;

public class countwords {
        public static void main(String[] args) {
            String ch = "aabbfffddh";
            int[] count = new int[256]; // ASCII size

            for (char c : ch.toCharArray()) {
                count[c]++;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] > 0) {
                    System.out.println((char) i + "-" + count[i]);
                }
            }
        }
    }

