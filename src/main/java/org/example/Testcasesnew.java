package org.example;

public class Testcasesnew {
    public static void main(String[] args) {


        String sp = "suraj";

        String emp = switch (sp){
            case "capgemini" , "tcs", "infosyis"->" working";
            case "not working","other" ,"suraj"->"other company";
            default -> throw new IllegalStateException("Unexpected value: " + sp);
        };
        System.out.println(emp);

    }
}
   
    
    

