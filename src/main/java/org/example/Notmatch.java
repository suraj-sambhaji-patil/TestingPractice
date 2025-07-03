package org.example;

public class Notmatch {
    public static void main(String[] args) {

        String sp = "123suraj@#$";
        char [] sa = sp.toCharArray();
        for(Character ch : sa){
            if (Character.isLetterOrDigit(ch)){

            }else {
                System.out.println(ch);
            }

           /* if(Character.isDigit(ch)){
               // System.out.println(ch);
            }else{
                System.out.print(ch);
            }*/
        }

    }
}
