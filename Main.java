import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    ArrayList<Woods> woodsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello world!");
    String item = "";
    int counterWood = 1;




    while (true){
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


        System.out.println("Enter Wood Type:");
        String woodType = scanner.nextLine();
        System.out.println("Enter Wood Weight(Kg):");
        String woodWeight = scanner.nextLine();
        System.out.println("Enter Wood Space Occupied(Metre squared):");
        String woodSpaceOccupied = scanner.nextLine();
        System.out.println("Enter Wood Value($):");
        String woodValue = scanner.nextLine();


        Woods newWood = new Woods(woodType, woodWeight, woodSpaceOccupied, woodValue);
        newWood.setName("Wood " + counterWood);
        woodsList.add(newWood);
        counterWood++;

        System.out.println("Would you like to add another Wood? (yes/no)");
        String userInput = scanner.nextLine();
        if (!userInput.equalsIgnoreCase("yes")) {
            break;
        }
      }
      System.out.println("List of Woods:");
      for (Woods wood : woodsList) {
        System.out.println(wood.getName());
      }
    } 
    

  }
}
