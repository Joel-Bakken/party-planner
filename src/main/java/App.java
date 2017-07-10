import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("How many people are attending the party:");
    String tempString = myConsole.readLine();
    int stringNumber  = Integer.parseInt(tempString);
    System.out.println("Do you want beverage service, this always includes a full bar: yes or no?");
    String userBeverage = myConsole.readLine();
    System.out.println("Do you want food service, this always includes appitizers, dinner and dessert: yes or no?");
    String userFood = myConsole.readLine();
    System.out.println("Do you want entertainment services, this always includes DJ and a stand-up commedian: yes or no?");
    String userEntertainment = myConsole.readLine();
    Event newEvent = new Event(stringNumber, userBeverage, userFood, userEntertainment);
    newEvent.getPeople();
    newEvent.getBeverage();
    newEvent.getFood();
    newEvent.getEntertainment();
    System.out.println("Your total cost is " + newEvent.calculateCost());
  }
}
