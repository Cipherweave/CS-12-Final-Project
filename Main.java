import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    
    Scanner scanner = new Scanner(System.in);
    String item = "";
    int counterWood = 1;



    while (true){



      while (true){

        Methods.ShowWoodList();
        System.out.println("What would you like to do? (Type Add for adding Items),(Type Remove for removing items),(Type Sort for Sorting)");
        String commandMain = scanner.nextLine();
 

        if (commandMain.equals("Add")) {
          Methods.Add();
          break;
        } else if (commandMain.equals("Remove")) {
          Methods.Remove();
        }
        
      }



    } 
    

  }
}


