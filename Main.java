/*****************************************
/*Program Name: Object Assesment
/*Programmer Name: Ali Karimi
/*Program Date: 1/30/2023
/*Program Description: This program works as a storage and use can add diferrent types of woods to it with their characteristics such as weight, value, space. 
The user also can sort them based on their critarias.
input: User commands
output: A list of all Items added by User printed on screen.

******************************************/


// Import the Scanner class for taking user inputs
import java.util.Scanner;
// Import the ArrayList class for storing the items
import java.util.ArrayList;





class Main {




    /*****************************************
   * /*Method Name: Main Method 
   * /*Programmer Name: Ali Karimi
   * /*Method Date: 1/30/2023
   * /*Method Description: Works as the roadmap of the code and asks the user What they want to do
 
   * /*Method Inputs/Outputs: input: User inputs
   * output: List of all Items with their characteristics and the question of what use want to do
   ******************************************/
  public static void main(String[] args) {


    GUI.PAGE();
    // Initialize the Scanner class for taking user inputs
    Scanner scanner = new Scanner(System.in);
    // Initialize an empty string for storing the item
    String item = "";
    // Initialize a counter for storing the number of items
    int counterWood = 1;


    // Start an infinite loop
    while (true){


      // Start another infinite loop
      while (true){
        // Call the `ShowWoodList` method from the `Methods` class to show the items
        Methods.ShowWoodList(); 
        Methods.ShowMetalsList(); 

        // Prompt the user for a command
        System.out.println("What would you like to do? (Type Add for adding Items),(Type Remove for removing items),(Type Sort for Sorting)");
        String commandMain = scanner.nextLine();
 
        // Check the user input and call the corresponding method from the `Methods` class
        if (commandMain.equals("Add")) {
          Methods.Add();
           // Break the inner loop if the user chose to add an item
          break;
        } else if (commandMain.equals("Remove")) {
          Methods.Remove();
        } else if (commandMain.equals("Sort")) {
          Methods.sort();
        } else {
          // If the user entered an invalid command, print an error message
          System.out.println("Wrong command");
        }
        
      }



    } 
    

  }


}


