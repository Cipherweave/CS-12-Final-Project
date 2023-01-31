import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import  java.util.Comparator;

//Declaring a class Methods 
public class Methods {
    
    //ArrayList woodsList to store objects of type Woods
    static ArrayList<Woods> woodsList = new ArrayList<>();

    //ArrayList metalsList to store objects of type Metals
    static ArrayList<Metals> metalsList = new ArrayList<>();

    //A variable counterWood to keep track of number of woods
    static int counterWood = 1;



    /*****************************************
   * /*Method Name: ShowWoodlist
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: This Method showes the list of all Items + their characteristics and its called from the main File
   * /*Method Inputs/Outputs: input: User inputs
   * output: List of all Items with their characteristics.
   ******************************************/
    public static void ShowWoodList() {

        //If the list is empty, it shows a message
        if (woodsList.isEmpty()) {
            System.out.println("The list is empty");

        //Otherwise, it shows the list of woods with table format
        } else {
            System.out.println("This is your Wood list.");
            //A variable to keep count of woods in the list
            int counter2 = 1;

            //Showing the header for table
            System.out.println("______________________________________________________________________________________________");
            //Displaying the columns with table format
            System.out.println(String.format("| %4s | %-15s | %-10s | %-15s | %-15s| %-15s|", "List", "Wood number code", "Wood Type", "Wood Weight (Kg)", "Wood Space(M^2)", "Wood Value($/Kg)"));
            System.out.println("______________________________________________________________________________________________");
    
            //Iterating through the list to display all the woods in table format
            for (Woods wood : woodsList) {
                System.out.println(String.format("| %4d | %-15s  | %-10s | %-15.2f | %-15.2f | %-15.2f |", counter2, wood.getName(), wood.getItemType(), wood.getItemWeight(), wood.getItemSpaceOccupied(), wood.getItemValue()));
                System.out.println("______________________________________________________________________________________________");
                //Increasing the counter2 by 1
                counter2 += 1;
            }
        }
    }


      /*****************************************
   * /*Method Name: ShowWoodlist
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: This Method showes the list of all Items + their characteristics and its called from the main File
   * /*Method Inputs/Outputs: input: User inputs
   * output: List of all Items with their characteristics.
   ******************************************/
    public static void ShowMetalsList() {

        //If the list is empty, it shows a message
        if (woodsList.isEmpty()) {
            System.out.println("The list is empty");

        //Otherwise, it shows the list of woods with table format
        } else {
            System.out.println("This is your Metals list.");
            //A variable to keep count of woods in the list
            int counter2 = 1;

            //Showing the header for table
            System.out.println("_________________________________________________________________________________________________");
            //Displaying the columns with table format
            System.out.println(String.format("| %4s | %-15s | %-10s | %-15s | %-15s| %-15s|", "List", "Metal number code", "Metal Type", "Metal Weight (Kg)", "Metal Space(M^2)", "Metal Value($/Kg)"));
            System.out.println("_________________________________________________________________________________________________");

            //Iterating through the list to display all the woods in table format
            for (Metals metal : metalsList) {
                System.out.println(String.format("| %4d | %-15s  | %-10s | %-15.2f | %-15.2f | %-15.2f |", counter2, metal.getName(), metal.getItemType(), metal.getItemWeight(), metal.getItemSpaceOccupied(), metal.getItemValue()));
                System.out.println("_________________________________________________________________________________________________");
                //Increasing the counter2 by 1
                counter2 += 1;
            }
    }
}


    /*****************************************
   * /*Method Name: Add to List
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: Ask the use about the new I tem and add it to the array list
 
   * /*Method Inputs/Outputs: input: User inputs
   * output: A new memeber added to the list of Items
   ******************************************/
    public static void Add() {


        //Creating an object of Scanner class to take input from user
        Scanner scanner = new Scanner(System.in);
        //A variable to store the type of item user wants to add
        String item = "";
        //A variable to exit the loop when user enters valid input
        int commandExit = 0;
        
        //A infinite loop to ask for type of item user wants to add, until he enters valid input
        while(true) {

            //A loop to ask for type of item user wants to add, until he enters valid input
            while (true){
                System.out.println("What Item would you like to add?(Type Wood for Wood)");
                //Taking input from user for type of item
                String commandItem = scanner.nextLine();
                //If user entered "Wood", setting item variable to "Wood" and breaking the loop
                if (commandItem.equals("Wood")){
                    item = commandItem;
                    break;
                } else if (commandItem.equals("Metal")) {
                    item = commandItem;
                    break;   
                } else {
                  System.out.println("Invalid input. Please try again");
                }
                
            }
    
            // Check if item selected is "Wood"
            if (item.equals("Wood")) {
                // Reset item variable
                item = "";
                // Read input for wood type
                System.out.println("Enter Wood Type:");
                // Read input for wood type
                String woodType = scanner.nextLine();

                float weight = 0;
                // Loop to get valid weight input
                while(true){
                    System.out.println("Enter Wood Weight(Kg):");
                    String woodWeight = scanner.nextLine();
                    
                    try {
                        // Try to parse the input to float
                        weight = Float.parseFloat(woodWeight);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood weight.");
                    }
                }
                
                float space = 0;
                // Loop to get valid space occupied input
                while(true){
                    System.out.println("Enter Wood Space Occupied(Metre squared):");
                    String woodSpaceOccupied = scanner.nextLine();
                    
                    try {
                        // Try to parse the input to float
                        space = Float.parseFloat(woodSpaceOccupied);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood space occupied.");
                        
                    }
                }
                
                float value = 0;
                // Loop to get valid value input
                while(true){
                    System.out.println("Enter Wood Value($ per Kg):");
                    String woodValue = scanner.nextLine();
                    
                    try {
                        // Try to parse the input to float
                        value = Float.parseFloat(woodValue);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood value.");
                        
                    }
                }
                
                // Create new Wood object with inputs
                Woods newWood = new Woods(woodType, weight, space, value);
                // Set name of the Wood object
                newWood.setName("Wood " + counterWood);
                // Add Wood object to the list
                woodsList.add(newWood);
                // Increment counter for Wood
                counterWood++;
                System.out.println("The Wood has succesfully added!");
                // Break out of the loop
                break;
            }




              
        }
  
        
    }
    


    /*****************************************
   * /*Method Name: Remove from the list
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: Ask the user that which value they want to remove from the list
 
   * /*Method Inputs/Outputs: input: User inputs
   * output: A member removed from the list of Items
   ******************************************/
    public static void Remove() {

         // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Check if the list of woods is empty
        if (woodsList.isEmpty()) {
            //System.out.println("The list is empty");

         // If the list is not empty, prompt user to remove an item
        } else {

            // Run a loop to allow the user to continue to remove items
            while (true) {
                System.out.println("Please selecet the number before the name to Remove Item. If you dont want to delete, Please Type Back ");
                String commandRemove = scanner.nextLine();

                // Check if user input is "Back"
                if (commandRemove.equals("Back")) {
                    break;
                }
                // Try to parse the user input as an integer
                try {
                    int index = Integer.parseInt(commandRemove);
                    // Check if the input number is between 1 and the size of the list
                    if (index < 1 || index > woodsList.size()) {
                        System.out.println("Invalid input. Please enter a number between 1 and " + woodsList.size());

                     // If the input is valid, remove the item from the list and print a success message
                    } else {
                        woodsList.remove(index-1);
                        System.out.println("Item removed successfully");
                        break;
                    }
                } catch (NumberFormatException e) {
                    // If the input is not an integer, print an error message
                    System.out.println("Invalid input. Please enter a valid number or 'Back'");
                }
            }
        }
    }


    /*****************************************
   * /*Method Name: Sorting the list
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: Ask the user which criteria they choose for Sorting 
 
   * /*Method Inputs/Outputs: input: User inputs
   * output: optimize the list based on the criteria choosen
   ******************************************/
    public static void sort() {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Run a loop to prompt user for sorting criteria
        while (true){
            System.out.println("What criteria would you choose? (Weight)(Space)(Value)");
            String criteria = scanner.nextLine();


            // Check if the user input is "Weight"
            if (criteria.equalsIgnoreCase("Weight")) {
                // Sort the list of woods by weight using a custom comparator
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getItemWeight(), o1.getItemWeight());
                    }
                });
                break;
            }
            // Check if the user input is "Space"
            else if (criteria.equalsIgnoreCase("Space")) {
                // Sort the list of woods by space occupied using a custom comparator
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getItemSpaceOccupied(), o1.getItemSpaceOccupied());
                    }
                });
                break;
            } 
            // Check if the user input is "Value"
            else if (criteria.equalsIgnoreCase("Value")) {
                // Sort the list of woods by value using a custom comparator
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getItemValue(), o1.getItemValue());
                    }
                });
                break;
            } 
            else {
                System.out.println("Invalid criteria");
            }



        }
            
    }

}
        

    

