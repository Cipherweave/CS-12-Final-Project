import java.util.Scanner;
import java.util.ArrayList;



public class Methods {

    static ArrayList<Woods> woodsList = new ArrayList<>();
    static int counterWood = 1;

    public static void ShowWoodList(){
        if (woodsList.isEmpty()) {
            
        } else {
            System.out.println("This is your Wood list.");
            int counter2 = 1;
            System.out.println("_____________________________________________________________________________");
            System.out.println(String.format("| %4s | %-15s | %-10s | %-15s | %-15s|", "List", "Wood number code", "Wood Type", "Wood Weight (Kg)", "Wood Value($/Kg)"));
            System.out.println("_____________________________________________________________________________");
            
            for (Woods wood : woodsList) {
                System.out.println(String.format("| %4d | %-15s  | %-10s | %-15s  | %-15s |", counter2, wood.getName(), wood.WoodType, wood.WoodWeight, wood.WoodValue));
                System.out.println("_____________________________________________________________________________");
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

                float weight = 0;
                while(true){
                    System.out.println("Enter Wood Weight(Kg):");
                    String woodWeight = scanner.nextLine();
                    
                    try {
                        weight = Float.parseFloat(woodWeight);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood weight.");
                    }
                }
                
                float space = 0;
                while(true){
                    System.out.println("Enter Wood Space Occupied(Metre squared):");
                    String woodSpaceOccupied = scanner.nextLine();
                    
                    try {
                        space = Float.parseFloat(woodSpaceOccupied);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood space occupied.");
                        
                    }
                }
                
                float value = 0;
                while(true){
                    System.out.println("Enter Wood Value($ per Kg):");
                    String woodValue = scanner.nextLine();
                    
                    try {
                        value = Float.parseFloat(woodValue);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number for wood value.");
                        
                    }
                }
                
                
                Woods newWood = new Woods(woodType, weight, space, value);
                newWood.setName("Wood " + counterWood);
                woodsList.add(newWood);
                counterWood++;
                System.out.println("The Wood has succesfully added!");
                break;
            }




              
        }
  
        
    }
    

    public static void Remove() {


        Scanner scanner = new Scanner(System.in);
        if (woodsList.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Sure this is your Wood list.");
            int counter2 = 1;
            for (Woods wood : woodsList) {
                System.out.println(counter2 + ") " + wood.getName() );
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



}
        

    

