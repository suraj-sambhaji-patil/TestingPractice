package org.example.InterviewQuestions;

public class Miniumvalue {
    public static void main(String[] args) {

        int[] numbers = {12, 9, 13, 4, 6, 2, 4, 12, 15};
        int minValue = findMinimumValue(numbers);
        System.out.println("Minimum value in the array is: " + minValue);
    }

    private static int findMinimumValue(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minValue = numbers[0];
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }
}
