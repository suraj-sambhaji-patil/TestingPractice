package org.example.InterviewQuestions;

public class RemoveTheduplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array before removing duplicates: ");
        for (int i : arr) {
           if(arr[i]==arr2[i]){
                System.out.print(i + " ");
           }
        }
      //  System.out.println();

        // Logic to remove duplicates can be added here
    }
}
