import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello world!");

    while (true){
      System.out.println("What Item would you like to add?(Type Wood for Wood)");
      String item = scanner.nextLine();
      if (item.equals("Wood")){
        break;
      } else {
        System.out.println("Invalid input.");
      }

      
    }

  }
}
