import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    
    Scanner scanner = new Scanner(System.in);
    String item = "";
    int counterWood = 1;



    while (true){



      while (true){

        System.out.println("What would you like to do? (Add for adding Items),(Remove for removing items),(List for seeing the list of items)");
        String commandMain = scanner.nextLine();
 

        if (commandMain.equals("Add")); {
          Methods.Add();
          break;

        }
        
      }



    } 
    

  }
}


