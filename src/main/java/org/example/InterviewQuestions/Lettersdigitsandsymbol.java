package org.example.InterviewQuestions;

public class Lettersdigitsandsymbol {
    public static void main(String[] args) {

        String sp = "\"dgdshjdhf-567fdjhhb90hjd+@3hdj#$h";

        char [] ss = sp.toCharArray();

        for(int i = 0; i < ss.length;i++){

            if(Character.isDigit(ss[i])){
               // System.out.print(ss[i]);
            }


            if(Character.isLetter(ss[i])){
              //  System.out.print(ss[i]);
            }

           /* if (Character.isLetterOrDigit(ss[i])){

            }else {
                System.out.print(ss[i]);
            }*/


        }


    }
}
