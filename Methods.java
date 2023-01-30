import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import  java.util.Comparator;


public class Methods {

    static ArrayList<Woods> woodsList = new ArrayList<>();
    static int counterWood = 1;

    public static void ShowWoodList(){
        if (woodsList.isEmpty()) {
            
        } else {
            System.out.println("This is your Wood list.");
            int counter2 = 1;
            System.out.println("_____________________________________________________________________________________________");
            System.out.println(String.format("| %4s | %-15s | %-10s | %-15s | %-15s| %-15s|", "List", "Wood number code", "Wood Type", "Wood Weight (Kg)","Wood Space(M^2)", "Wood Value($/Kg)"));
            System.out.println("_____________________________________________________________________________");
            
            for (Woods wood : woodsList) {
                System.out.println(String.format("| %4d | %-15s  | %-10s | %-15s  | %-15s | %-15s|", counter2, wood.getName(), wood.WoodType,  wood.WoodWeight, wood.WoodSpaceOccupied , wood.WoodValue));
                System.out.println("_____________________________________________________________________________________________");
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


    
    public static void sort() {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("What criteria would you choose? (Weight)(Space)(Value)");
            String criteria = scanner.nextLine();



            if (criteria.equalsIgnoreCase("Weight")) {
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getWoodWeight(), o1.getWoodWeight());
                    }
                });
                break;
            }
            else if (criteria.equalsIgnoreCase("Space")) {
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getWoodSpaceOccupied(), o1.getWoodSpaceOccupied());
                    }
                });
                break;
            } 
            else if (criteria.equalsIgnoreCase("Value")) {
                woodsList.sort(new Comparator<Woods>() {
                    @Override
                    public int compare(Woods o1, Woods o2) {
                        return Float.compare(o2.getWoodValue(), o1.getWoodValue());
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
        

    

