package org.example;

public class Stringclass {
    public static void main(String[] args) {

        String sp = "suraj";
        String sp1 = new String("patil");
        int count =0 ;
        //System.out.println(sp.charAt(3));
        char[] ch = sp.toCharArray();
        for(int i = 0 ; i<ch.length;i++){
            if(ch[i]=='a'){
                count++;
            }

        }
        System.out.println(count);





    }
}
