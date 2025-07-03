package org.example.InterviewQuestions;

public class Ispresentandprint {
    public static void main(String[] args) {

        String sp = "surajqqq sambhaji patil qqq";
        String [] ss = sp.split(" ");
        for(int i = 0 ; i < ss.length;i++){
          String sr  =ss[i];
          if(sr.contains("qqq")){
              System.out.println(ss[i]);
          }



        }





    }
}
