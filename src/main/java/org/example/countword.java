package org.example;

public class countword {
    public static void main(String[] args) {
        String sp = "aabbccddee";
        int[] count = new int[256];

        for (char ch : sp.toCharArray()){
            count[ch]++;
        }

        for(int i = 0 ; i<count.length;i++){
            if(count[i]>0){
                System.out.println((char)i +"-"+count[i]);
            }
        }


    }
}
