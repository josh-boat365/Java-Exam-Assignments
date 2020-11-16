package QThree01194083D;

import java.util.Scanner;

enum IteCat {
    WOMEN,
    MEN,
    GIRLS,
    BOYS,
    BABIES,
    UNISEX
}

class StoreItem {
    long itemNumber;
    IteCat category;
    String itemName;
    boolean isClothingItem;
    double unitPrice;
    String clothing;
    int number;

   /* void createItem(){
        this.itemNumber = 101112;
        this.itemName = "Skit and Top";
        this.category = IteCat.WOMEN ;
        this.isClothingItem = true;
        this.unitPrice = 350.00;
    }*/

    void userInput() {
        //scanner to get input
        Scanner input = new Scanner(System.in);

        //sout to prompt user for input
        System.out.print("Stock #: ");
        itemNumber = input.nextInt();
        System.out.println("Clothing Item: use 'yes'or 'no'");
        clothing = input.next();
        switch (clothing) {
            case "yes":
                isClothingItem = true;
                break;
            default:
                isClothingItem = false;
        }
        System.out.println("Choose Clothing Category: ");
        System.out.println("1.MENS WEAR     2.WOMENS WEAR");
        System.out.println("3.BOYS WEAR     4.GIRLS WEAR");
        System.out.println("5.BABIES WARE             ");
        System.out.println("Choose By Using Numbers:");
        number = input.nextInt();
        switch (number) {
            case 1:
                category = IteCat.MEN;
                break;
            case 2:
                category = IteCat.WOMEN;
                break;
            case 3:
                category = IteCat.BOYS;
                break;
            case 4:
                category = IteCat.GIRLS;
                break;
            case 5:
                category = IteCat.BABIES;
                break;
            default:
                category = IteCat.UNISEX;
        }
        input.nextLine();
        System.out.println("Name: ");
        itemName = input.nextLine();
        System.out.println("Unit Price: ");
        unitPrice = input.nextDouble();


    }


    void display() {

        System.out.println("Department Store");
        System.out.println("*******************");
        System.out.println("Stock #:            " + this.itemNumber     );
        System.out.println("Clothing Item:      " + this.isClothingItem);
        System.out.println("Category:           " + this.category        );
        System.out.println("Name:               " + this.itemName       );
        System.out.println("Unit Price:         " + this.unitPrice      );
    }
}


public class Melcom01194083D {
    public static void main(String[] args) {
        //using do while loop to loop over the whole program with a prompt input from the user.
        int programTerminator = 0;
        do {
            Scanner get = new Scanner(System.in);
            StoreItem store = new StoreItem();
            //store.createItem();
            store.userInput();
            store.display();
            System.out.println("Enter 1 to continue or any value to exit........");
            programTerminator = get.nextInt();
        } while (programTerminator == 1);


    }
}
