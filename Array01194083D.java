package Qone01194083D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array01194083D {
    public static void main(String[] args) {
        // java program to accept 10 numbers in an array and display the sum, average & the reverse order
        //initialising array
        int array [] = new int[10];

        //declaring variable for manipulation
        int sum=0;
        double average;

        //scanner to get input
        Scanner input = new Scanner(System.in);

        //prompt user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");
        //for loop to get input
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        //sum of elements in array
        System.out.println("Sum = "+sum);

        //average of elements in array
        average = sum/ 10.0;
        System.out.println("Average = "+average);

        //reverse order of array
        System.out.print("[ ");
        for (int i = 9; i >= 0; i--) {
            System.out.print( array[i] + " ");
        }
        System.out.println("]");


    }
}
