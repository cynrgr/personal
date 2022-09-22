import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {
        
        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Garlic and 5 Cheese Pizza that costs 355.00 pesos");
        System.out.println("Enter B if you want a Halleluia Mozarella Pizza that costs 370.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        System.out.print("Press C if you want hand-tossed \n");
        System.out.print("Press D if you want your pizza thin crust \n");
        System.out.println("Select your dough: ");
        char type = scan.next().charAt(0);

        System.out.print("Press E to select Medium 9inch size \n");
        System.out.print("Press F to select Family 12inch size \n");
        System.out.print("Press G to select Big Family 14inch size \n");
        System.out.println("Choose size: ");
        char size2 = scan.next().charAt(0);
       
        String pizza = "";
        double price = 0;
        String crust = "";
        String pizzaSize = "";


        switch (choice) {
            case 'A':
                pizza = "Creamy Garlic and 5 Cheese Pizza";
                price = 355.00;
                break; 
            case 'B':
                pizza = "Halleluia Mozarella Pizza";
                price = 370.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }
        switch (type) {
            case 'C':
                crust = "Hand-tossed crust";
                break;
            case 'D':
                crust = "Thin crust";
                break;
            default:
                System.out.println("You did not select type of crust");
                return;
        }
        switch (size2) {
            case 'E':
                pizzaSize = "Medium 9inch size";
                break;
            case 'F':
                pizzaSize = "Family 12inch size";
                break;
            case 'G':
                pizzaSize = "Big Family 14inch size";
                break;
            default:
                System.out.println("You did not select pizza size");
                return;
            
        }

        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();

        System.out.println("Your order is: " + quantity + " " + pizzaSize + " " + pizza + " with " + crust);
        System.out.println("Your total amount is: " + (quantity*price));

        scan.close();
    }
}

    
