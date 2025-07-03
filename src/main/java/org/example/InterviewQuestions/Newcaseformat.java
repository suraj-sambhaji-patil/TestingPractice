package org.example.InterviewQuestions;

public class Newcaseformat {
    public static void main(String[] args) {

        String day = "Monday";

        // Modern switch case with arrow (->)
        String typeOfDay = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Day: " + day);
        System.out.println("Type: " + typeOfDay);

    }
}
