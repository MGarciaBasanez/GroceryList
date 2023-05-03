package edu.cscc;
import java.util.Arrays;
import java.util.Scanner;

// Grocery List

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0; // Number of items currently in the grocery list
        String[] groceryList = new String[6];  // how many items we will have in the list
        // Set amount of times we will be adding into the list and memory position as well
        while (count < 6) {

            // get grocery item
            System.out.print("Enter grocery item: ");
            String item = input.nextLine();

            // Call in method to check if we have already added the item
            if (isDuplicate(item, groceryList, count) == true){
                // tell them it is a duplicate
                System.out.println("Sorry item is a duplicate");
            } else {
                //continue the loop once duplicate is false
                groceryList[count] = item;
                count++;
            }
        }

        //  sort grocery list from A-Z and print out the list
        Arrays.sort(groceryList);
        System.out.println("Your Grocery List");
        for (String oneItem : groceryList){
            System.out.println(oneItem);
        }

    }

    // Method to check if grocery item is already on the list
    public static boolean isDuplicate(String item, String[] list, int listcnt){

        // Establish out boolean expression as false until it is proven that the item list was already repeated
            boolean isDupe = false;
            for (int i = 0; i < listcnt; i++){
                if (item.equalsIgnoreCase(list[i])){
                    isDupe = true;
                }
            }

            // Tell the main code if the item was repeated
            return isDupe;

        }


    }
