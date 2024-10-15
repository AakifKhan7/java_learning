import java.util.Scanner;
class coffee_machine {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Ordering System! \n1. Espresso \n2. Cappuccino \n3. Latte");
        int choice = sc.nextInt();

        if(choice < 1 || choice > 3){
            System.out.println("invalid choice. Please enter a number between 1 and 3.");
            System.out.println("Thank you for visiting us");
            return;
        }

        System.out.print("Enter the quantity(number of coffees): ");
        int quantity = sc.nextInt();

        String coffeeType = "";
        switch (choice) {
            case 1:
                coffeeType = "Espresso";
                break;
            case 2:
                coffeeType = "Cappuccino";
                break;
            case 3:
                coffeeType = "Latte";
                break;
        }

        System.out.println("Thank you for selecting "+ coffeeType + ".");

        System.out.print("Enter the size of your drink(200ml or 400ml): ");
        int size = sc.nextInt();


        double pricePerCoffee = 0;

        switch (choice) {
            case 1:
                if (size == 200){
                    pricePerCoffee = 100;
                }
                else if (size == 400){
                    pricePerCoffee = 200;
                }
                break;
        
            case 2:
                if (size == 200){
                    pricePerCoffee = 150;
                }
                else if (size == 400){
                    pricePerCoffee = 250;
                }
                break;

            case 3:
                if (size == 200){
                pricePerCoffee = 200;
                }
                else if (size == 400){
                    pricePerCoffee = 300;
                }
                break;
            }

            if(size == 200 || size == 400){
                if (pricePerCoffee > 0){
                    double totalPrice = pricePerCoffee * quantity;
                    System.out.println("You have ordered " + quantity + " " + coffeeType + "(s) of size" + size + "ml");
                    System.out.println("Total Price: Rs." + totalPrice);
                }
                else{
                    System.out.println("Invalid size for " + coffeeType + ".");
                }
            }
            else{
                System.out.println("Only 200ml or 400ml sizes are available.");
            }

            System.out.println("Thank you for visiting us.");

            sc.close();
    }
    
}