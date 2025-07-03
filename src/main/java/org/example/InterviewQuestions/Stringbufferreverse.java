package org.example.InterviewQuestions;

public class Stringbufferreverse {
    public static void main(String[] args) {

        String sp = "suraj patil sambhaji";

        String [] ss= sp.split(" ");

        for(int i = 0; i < ss.length; i++) {
            String sd = ss[i];
            StringBuilder sb = new StringBuilder(sd);
            sb.reverse();
            System.out.print( " "+sb);
        }
    }
}
