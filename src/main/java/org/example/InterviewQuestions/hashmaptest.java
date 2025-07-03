package org.example.InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmaptest<S, S1> {
    public static <map> void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String >map = new HashMap<>();
        map.put("name", "suraj");
        map.put("role", "developer");

        list.add(map);

        Map<String, String>firstname = list.get(0);
        System.out.println("Name: " + firstname.get("name")); // Output: suraj
















      /*  List<Map<String, String>> list = new ArrayList<>();

        // Create a HashMap and add some key-value pairs
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "Alice");
        map1.put("role", "Engineer");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Bob");
        map2.put("role", "Designer");

        // Add HashMaps to the list
        list.add(map1);
        list.add(map2);

        Map<String, String> firstMap = list.get(0);

        // Get the value for key "name"
        String name = firstMap.get("name");

        System.out.println("Name from first map: " + name); // Output: Alice


*/



    }
}
