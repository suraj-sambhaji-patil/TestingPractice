package org.example.InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Removeduplicates {
    public static void main(String[] args) {

       /* String sp = "suraj sambhaji patil ";

        String [] li = sp.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(li));



       // List<String> list = Arrays.asList(li);
*//*
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + list.get(i));

        }*//*

        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

       *//* list.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);*//*

*//*        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




        System.out.println("Distinct and sorted list: " + list);*//*



       // Arrays.stream(li).sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);


*/

        String input = "suraj sambhaji patil";
        List<String> chars = Arrays.asList(input.split(" "));
        chars.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);





/*        Collections.reverse(chars);
        System.out.println(chars);*/
      /*  String reversed = chars.stream().collect(Collectors.joining());
        System.out.println(reversed);*/

    }
}
