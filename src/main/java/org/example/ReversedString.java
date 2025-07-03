package org.example;

import java.util.LinkedList;
import java.util.List;

public class ReversedString {

    public static void main(String[] args) {

        String sp = "Amit prasad pune";

        String [] s = sp.split(" ");

        List<String>li = new LinkedList<>();

        int  count=0;

        for(int i = 0 ; i<s.length;i++){

            li.add(s[i]);
            System.out.println(li);
            count++;
            for(int j =0;j<count;i++){
                li.add(",");
                System.out.println(li);
            }
        }



    }
}
