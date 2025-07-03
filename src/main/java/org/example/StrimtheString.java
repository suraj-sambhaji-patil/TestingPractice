package org.example;

public class StrimtheString {
    public static void main(String[] args) {
        String ss = " suraj patil  ";
        String [] s1 = ss.split(" ");
        String sd = "";
        for(int i = 0 ; i < s1.length;i++){
            System.out.print(sd.concat(s1[i]));
        }

       // System.out.println(ss.trim());

    }
}
