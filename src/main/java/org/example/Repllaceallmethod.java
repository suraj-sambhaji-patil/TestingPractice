package org.example;

public class Repllaceallmethod {
    public static void main(String[] args) {

        String sp = "suraj23";
      char [] ss = sp.toCharArray();

      for(int i = 0 ; i<ss.length;i++){
          char sa = ss[i];
          if(Character.isDigit(sa)){
              System.out.print(sa);
          }

      }

    }

}
