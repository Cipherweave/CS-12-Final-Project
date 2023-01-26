import java.util.Scanner;

class Main {
  public static void main(String[] args) {

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
        Woods wood = new Woods();
        wood.setName("Wood " + counterWood);
        System.out.println("A new Wood object named " + wood.getName() + " has been created.");
        counterWood++;
      }

    } 
    

  }
}
