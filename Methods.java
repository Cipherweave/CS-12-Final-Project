import java.util.Scanner;
import java.util.ArrayList;



public class Methods {

    static ArrayList<Woods> woodsList = new ArrayList<>();
    static int counterWood = 1;

    public static void ShowList(){
        if (woodsList.isEmpty()) {
            
        } else {
            System.out.println("This is your Wood list.");
            int counter2 = 1;
            for (Woods wood : woodsList) {
                System.out.println(counter2 + ") " + wood.getName());
                counter2 += 1;
            }
        }
    } 

    public static void Add() {


        
        Scanner scanner = new Scanner(System.in);
        String item = "";
        int commandExit = 0;
        
        while(true) {

            while (true){
                System.out.println("What Item would you like to add?(Type Wood for Wood)");
                String commandItem = scanner.nextLine();
                if (commandItem.equals("Wood")){
                  item = commandItem;
                  break;
                } else {
                  System.out.println("Invalid input. Please try again");
                }
                
            }
    
    
            if (item.equals("Wood")) {
    
                item = "";
                System.out.println("Enter Wood Type:");
                String woodType = scanner.nextLine();
                System.out.println("Enter Wood Weight(Kg):");
                String woodWeight = scanner.nextLine();
                System.out.println("Enter Wood Space Occupied(Metre squared):");
                String woodSpaceOccupied = scanner.nextLine();
                System.out.println("Enter Wood Value($ per Kg):");
                String woodValue = scanner.nextLine();
        
                
                Woods newWood = new Woods(woodType, woodWeight, woodSpaceOccupied, woodValue);
         
                newWood.setName("Wood " + counterWood);
                woodsList.add(newWood);
                counterWood++;
                System.out.println("The Wood has succesfully added!");
                break;

                // while (true) {
                //     System.out.println("Would you like to add another Wood? (yes/no)");
                //     String userInput = scanner.nextLine();
                //     if (userInput.equalsIgnoreCase("yes")) {
                //         break;
                //     } else if (userInput.equalsIgnoreCase("no")) {
                //         commandExit = 1;
                //         break;  
                //     } else {
                //         System.out.println("Wrong input please try again");
                //     }
                // }
                // if (commandExit == 1){
                //     commandExit = 0;
                //     break;
                // }
                
              }




              
        }
        // System.out.println("List of Woods:");
        // for (Woods wood : woodsList) {
        //     System.out.println(wood.getName());
        // }
        
    }
    

    public static void Remove() {


        Scanner scanner = new Scanner(System.in);
        if (woodsList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Sure this is your Wood list.");
            int counter2 = 1;
            for (Woods wood : woodsList) {
                System.out.println(counter2 + ") " + wood.getName());
                counter2 += 1;
            }

            while (true) {
                System.out.println("Please selecet the number before the name to Remove Item. If you dont want to delete, Please Type Back ");
                String commandRemove = scanner.nextLine();

                if (commandRemove.equals("Back")) {
                    break;
                }
                try {
                    int index = Integer.parseInt(commandRemove);
                    if (index < 1 || index > woodsList.size()) {
                        System.out.println("Invalid input. Please enter a number between 1 and " + woodsList.size());
                    } else {
                        woodsList.remove(index-1);
                        System.out.println("Item removed successfully");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'Back'");
                }
            }
        }
    }






       
        //woodsList
}
        

    

