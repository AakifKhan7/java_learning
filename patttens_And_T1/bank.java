import java.util.*;

class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Hello, User Welcome to Banking System---------");
        System.out.println("First Enter Your Personal details");
        System.out.print("Enter Your Full name (FIRST_NAME MIDDLE_NAME LAST_NAME): ");
        String fullName = sc.nextLine();

        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Your Password: ");
        String password = sc.nextLine();

        System.out.print("Enter confirm password: ");
        String confirmPassword = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Sorry. Kindly enter a valid password. Password length must be greater than or equal to 8.");
            return;
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Sorry... Password & Confirm Password must be the same. Please enter correctly.");
            return;
        }

        String[] name = fullName.split(" ");
        int age = 2024 - birthYear;
        String userId = name[0] + age;
        System.out.println("Your User ID is: " + userId);

        System.out.println("Now enter your User ID for login: ");
        String uId = sc.nextLine();
        System.out.println("Now enter your password: ");
        String pass = sc.nextLine();

        if (uId.equals(userId) && pass.equals(password)) {
            System.out.println("Login Successful...");
            System.out.println("----------------Welcome to Banking System---------------");
            System.out.println("Enter 1 to know Your Balance");
            System.out.println("Enter 2 to know Your PIN");
            System.out.println("Enter 3 to know Your Profile");
            System.out.println("Enter 4 to Withdraw");
            System.out.println("Enter 5 to Deposit");
            System.out.println("Enter 6 to Exit");

            int choice;
            int balance = 10000;

            do {
                System.out.print("Your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: " + balance);
                        break;
                    case 2:
                        String pin = Integer.toString(birthYear);
                        StringBuffer finalPin = new StringBuffer(pin);
                        System.out.println("Your PIN is " + finalPin.reverse());
                        break;
                    case 3:
                        System.out.println("\nFirst Name: " + name[0] + 
                                            "\nMiddle Name: " + name[1] + 
                                            "\nLast Name: " + name[2]);
                        System.out.println("Your Age: " + age);
                        System.out.println("Address: " + address);
                        break;
                    case 4:
                        System.out.print("Enter amount you want to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient balance! Please try a smaller amount.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful! Remaining balance: " + balance);
                        }
                        break;
                    case 5:
                        System.out.print("Enter amount you want to deposit: ");
                        int depositAmount = sc.nextInt();
                        balance += depositAmount;
                        System.out.println("Deposit successful! New balance: " + balance);
                        break;
                    case 6:
                        System.out.println("Thank you for using the Banking System. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } while (choice != 6);
        } else {
            System.out.println("Invalid User ID or Password. Login failed.");
        }
        sc.close();
    }
}
