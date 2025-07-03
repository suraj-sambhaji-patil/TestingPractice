package org.example;

public class Testcount {
    public static void main(String[] args) {
        String sp = "aassddffgg";
        int [] count = new int[365];

        for(char ch : sp.toCharArray()){
            count[ch]++;
        }

        for(int i = 0 ; i<count.length;i++){
            if(count[i]>0){
                System.out.println((char)i+"-"+count[i] );
            }
        }



    }
}
