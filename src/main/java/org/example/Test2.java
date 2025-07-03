package org.example;

public class Test2 {
    public static void main(String[] args) {

        String sp = "suraj";

        for(char ch :sp.toCharArray()){
            String a = String.valueOf(ch);
            String s = new StringBuilder(a).reverse().toString();
            System.out.println(s);
        }


    }
}
