package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*String[] items = {"napkins", "spoons", "small foam cups", "large foam cups", "sugar cones",
                "small waffle cones", "large waffle cones", "ice cream scoops"};

        for(int i = 0; i < items.length; i++)
        {
            System.out.println(items[i]);
        }*/

        Scanner scanner = new Scanner(System.in);

        // set up two arrays, one of strings for item names one of ints for amount in stock
        String[] items = {"napkins", "spoons", "foam cups", "waffle cones", "ice cream scoops"};

        int[] inventory = {5000, 500, 500, 500, 5};

        // holds name of item to search for
        String check = "", sContinue = "";

        // holds amount of item to be removed from inventory, array location holder
        int input = 0, place = 0;

        System.out.println("Enter item to search for: ");
        check = scanner.nextLine();

        // trim check
        check = check.trim();

        // run through the items array to look for the searched item
        for (String x : items) {
            if (items[place].contains(check)) {
                break;
            }
            else
            {
                place++;
            }
        }

        // if place is greater than the length of the array the item was not found print error message
        if (place > items.length)
        {
            System.out.println("Error: Item not found. Please reboot.");
            System.exit(0);
        }

        System.out.println("You seached for: " + check);
        System.out.println("There are currently " + inventory[place] + " " + items[place] + " in the inventory.");
        System.out.println("How many were used today: ");
        input = scanner.nextInt();

        if ((inventory[place] - input) < 0)
        {
            System.out.println();
            inventory[place] = 0;
            System.out.println("Error: There cannot be less than 0 items in the inventory. Amount set to 0.");
        }
        else
        {
            System.out.println();
            inventory[place] -= input;
            System.out.println("There are now " + inventory[place] + " " + items[place] + " in the inventory.");
        }

        System.out.println();

        System.out.println("Have a nICE day!");
    }
}
