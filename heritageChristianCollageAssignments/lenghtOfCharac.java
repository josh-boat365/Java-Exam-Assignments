package heritageChristianCollageAssignments;


import java.util.Scanner;

public class  lenghtOfCharac {
    // class 'lengthOfCharac' to hold method for counting string input values.
    public static int charaCterlen(){
        // a method 'charaCterlen' to perform counting of characters
        // * creating a variable input to access the scanner class to get user input
        Scanner input = new Scanner(System.in);

        // variable to hold user input
        String text;
        // variable to hold the number of characters typed.
        int numOfChars;

        // user prompt to input characters
        System.out.println("Enter Characters: ");
        // method for getting characters from user
        text = input.next();

        //method to hold number of characters typed
        numOfChars= text.length();

        //to return the value of characters typed
        return numOfChars;
    }
    public static void main(String[] args) {
        //instantiating object of the class 'lengthOfCharac()'
             lenghtOfCharac len = new lenghtOfCharac();

             //displaying results
        System.out.println("Number of Characters Typed = "+len.charaCterlen());

    }
}
