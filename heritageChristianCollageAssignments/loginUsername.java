package heritageChristianCollageAssignments;

import java.util.Scanner;

public class loginUsername {
    // class 'loginUsername' to hold method for generating userID for a login.
    public static   String username(){
        // a method 'username' to perform composition of the first character of the first name and last name
        // * creating a variable 'get' to access the scanner class to print user input
        Scanner get = new Scanner(System.in);
        //variables to hold first name (fname) and last name (lname)
        String fname, lname;

        //* prompting user to enter respective names
        System.out.println("Enter First Name: ");
        //method to get firstname
        fname = get.next();

        System.out.println("Enter Last Name: ");
        //method to get lastname
        lname = get.next();

        //declaring and instantiating variable to generate userID
        String usernameCombination = fname.charAt((0)) + lname;
        //to return userID
        return usernameCombination;
    }
    public static void main(String[] args) {
        //instantiating object of the class 'loginUsername()'
        loginUsername userid = new loginUsername();

        //display composed userID
        System.out.println("Generated UserID = "+userid.username());
    }
}
