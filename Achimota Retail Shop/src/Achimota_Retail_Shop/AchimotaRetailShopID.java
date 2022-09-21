package Achimota_Retail_Shop;

import java.util.Scanner;

public class AchimotaRetailShopID {
    CustomerID customerDetails = new CustomerID();
    PricesID priceDetails = new PricesID();
    ItemsID itemDetails = new ItemsID();
    DateID dateDetails = new DateID();
    enum ITEMS{
        Mouse,
        Keyboard,
        PenDrive,
        HardDisk,
        Speaker
    }


    void getDetailsOfCustomer(){
//        scanner to get details of customer
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Achimota Retail Shop");
//        get customer name and phone number
        System.out.print("Please Enter Customer's Name: ");
        customerDetails.setCustomerName(input.next());
        System.out.print("Please Enter Customer's Phone Number: ");
        customerDetails.setCustomerMobileNumber(input.nextLong());
//        get prices
        System.out.print("What is the price of "+ITEMS.HardDisk+": ");
        priceDetails.setPrice_of_item1(input.nextDouble());
        System.out.print("What is the price of "+ITEMS.Keyboard+": ");
        priceDetails.setPrice_of_item2(input.nextDouble());
        System.out.print("What is the price of "+ITEMS.Mouse+": ");
        priceDetails.setPrice_of_item3(input.nextDouble());
        System.out.print("What is the price of "+ITEMS.PenDrive+": ");
        priceDetails.setPrice_of_item4(input.nextDouble());
        System.out.print("What is the price of "+ITEMS.Speaker+": ");
        priceDetails.setPrice_of_item5(input.nextDouble());
//        get quantity of items
        System.out.print("How Many "+ITEMS.HardDisk+"s were ordered: ");
        itemDetails.setQuantity_of_item1(input.nextInt());
        System.out.print("How Many "+ITEMS.Keyboard+"s were ordered: ");
        itemDetails.setQuantity_of_item2(input.nextInt());
        System.out.print("How Many "+ITEMS.Mouse+"s were ordered: ");
        itemDetails.setQuantity_of_item3(input.nextInt());
        System.out.print("How Many "+ITEMS.PenDrive+"s were ordered: ");
        itemDetails.setQuantity_of_item4(input.nextInt());
        System.out.print("How Many "+ITEMS.Speaker+"s were ordered: ");
        itemDetails.setQuantity_of_item5(input.nextInt());
//        get day of visit
        System.out.println("Enter Details of Clients Below");
        System.out.println("***********************************************");
        System.out.println("Enter Month-number: ");
        dateDetails.setOrderMonth(input.nextInt());
        System.out.println("Enter Day-number: ");
        dateDetails.setOrderDay(input.nextInt());
        System.out.println("Enter Year: ");
        dateDetails.setOrderYear(input.nextInt());

        //calculations






    }

    void createReciept(){
        System.out.println("=/= Achimota Retail Shop =/=");
        System.out.println("==============================================");
        System.out.println("Customer Name: "+ customerDetails.getCustomerName());
        System.out.println("Mobile Phone: "+customerDetails.getCustomerMobileNumber());
        System.out.println("Order Date: "+ dateDetails.getOrderDay()+"/"+dateDetails.getOrderMonth()+"/"+dateDetails.getOrderYear());
        System.out.println("===============================================");
        System.out.println("Item Type\t\tQty\t\tUnit Price\t\tSub-Total");
        System.out.println(ITEMS.HardDisk+"\t\t"+itemDetails.quantity_of_item1+"\t\t"+priceDetails.price_of_item1+"\t\t"+itemDetails.quantity_of_item1*priceDetails.price_of_item1);
        System.out.println(ITEMS.Keyboard+"\t\t"+itemDetails.quantity_of_item2+"\t\t"+priceDetails.price_of_item2+"\t\t"+itemDetails.quantity_of_item2*priceDetails.price_of_item2);
        System.out.println(ITEMS.Mouse+"\t\t"+itemDetails.quantity_of_item3+"\t\t"+priceDetails.price_of_item3+"\t\t"+itemDetails.quantity_of_item3*priceDetails.price_of_item3);
        System.out.println(ITEMS.PenDrive+"\t\t"+itemDetails.quantity_of_item4+"\t\t"+priceDetails.price_of_item4+"\t\t"+itemDetails.quantity_of_item4*priceDetails.price_of_item4);
        System.out.println(ITEMS.Speaker+"\t\t"+itemDetails.quantity_of_item5+"\t\t"+priceDetails.price_of_item5+"\t\t"+itemDetails.quantity_of_item5*priceDetails.price_of_item5);
        System.out.println("===============================================");

        double TotalOrder = priceDetails.price_of_item1+priceDetails.price_of_item2+priceDetails.price_of_item3+priceDetails.price_of_item4+priceDetails.price_of_item5;
        double totalDiscount = 0.25 * TotalOrder;
        int totalNumberOfItems = itemDetails.quantity_of_item1 + itemDetails.quantity_of_item2 + itemDetails.quantity_of_item3 + itemDetails.quantity_of_item4 + itemDetails.quantity_of_item5;
        System.out.print("Number of Items: "+ totalNumberOfItems);
        System.out.println("Total Order: $"+TotalOrder+" Total Discount: $"+totalDiscount);
        System.out.println("===============================================");
        System.out.println("Created By Joshua Nyarko Boateng");



    }

    public static void main(String[] args) {
        AchimotaRetailShopID data = new AchimotaRetailShopID();
        data.getDetailsOfCustomer();
        data.createReciept();

    }
}
