package org.example.Java8;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before reversing: ");
        printArray(arr);
    }

    private static void reverseArray(int[] arr) {
    }

    private static void printArray(int[] arr) {

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
