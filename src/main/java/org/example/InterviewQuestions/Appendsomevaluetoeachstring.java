package org.example.InterviewQuestions;

public class Appendsomevaluetoeachstring {
    public static void main(String[] args) {
        String sp = "suraj patil sambhaji";

      /*  String [] ss = sp.split(" ");

        for(int i = 0 ; i < ss.length;i++){

            String sd = ss[i];
            System.out.println(sd.concat("123"));
        }*/

        StringBuilder sb = new StringBuilder("Hello ");
      /*  sb.append(sp);
        System.out.println("Original String: " + sb);*/

        sb.insert(1, "World ");

        System.out.println("Original String: " + sb);



    }







}
