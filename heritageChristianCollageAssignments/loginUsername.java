package heritageChristianCollageAssignments;

import java.util.Scanner;

public class loginUsername {
    public static   String username(){
        Scanner get = new Scanner(System.in);
        String fname, lname;
        System.out.println("Enter First Name: ");
        fname = get.next();

        System.out.println("Enter Last Name: ");
        lname = get.next();

        String usernameCombination = fname.charAt((0)) + lname;
        return usernameCombination;
    }
    public static void main(String[] args) {
        loginUsername userid = new loginUsername();

        System.out.println("Generated UserID = "+userid.username());
    }
}
