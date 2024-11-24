import java.util.*;
class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "1234";
        int attempts = 0;
        int balance = 100000;
        boolean atmOpen = true;

        while (atmOpen) {
            if (attempts == 3){
                System.out.println("Your account is locked for 24 hrs.");
                break;
                }
            System.out.print("Enter your password: ");
            String userInput = sc.nextLine();

            if(userInput.equals(password)){
                System.out.println("Welcome!");
                boolean bbb = true ;
                while (bbb) {
                    System.out.println("\nATM Menu:");
                    System.out.println("1. Choose 1 for password change");
                    System.out.println("2. Choose 2 for Withdrawal");
                    System.out.println("3. Choose 3 for Deposit");
                    System.out.println("4. Choose 4 for Balance inquiry");
                    System.out.println("5. Choose 5 for EXIT");
                    System.out.print("Enter your choice (1-5): ");
                    String choice = sc.next();
                    
                    switch (choice) {
                        case "1":
                            System.out.println("Enter your new password: ");
                            String newPassword = sc.next();
                            boolean isValid = true;

                            if(newPassword.length() == 4){
                                for(int i = 0; i < newPassword.length(); i++){
                                    if(newPassword.charAt(i)< '0' || newPassword.charAt(i) > '9'){
                                        isValid = false;
                                        break;
                                    }
                                }
                            }
                            else{
                                    isValid = false;
                            }
                            if(isValid){
                                password = newPassword;
                                System.out.println("Password changed successfully!");
                            }
                            else{
                                System.out.println("Invalid password! Password must be 4 digits long and contain only numbers.");
                            }
                            break;

                        case "2":
                            System.out.println("Enter the amount you want to withdraw: ");
                            int withdraw = sc.nextInt();
                            if(withdraw > balance){
                                System.out.println("Invalid withdrawal amount or insufficient balance.");
                            }
                            else{
                                balance -= withdraw;
                                System.out.println("Withdrawal successful. Updated balance: Rs. " + balance);
                            }
                            break;

                        case "3":
                            System.out.println("Enter the amount you want to deposit: ");
                            int deposit = sc.nextInt();
                            balance += deposit;
                            System.out.println("Deposit successful. Updated balance: Rs. " + balance);
                            break;

                        case "4":
                            System.out.println("Your current balance is: Rs. " + balance);
                            break;

                        case "5":
                            System.out.println("Thank you for using our ATM. Goodbye!");
                            bbb = false;
                            atmOpen = false;
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                }
            }
            else{
                attempts++;
                System.out.println("Invalid password. Attempts left: " + (3 - attempts));
            }
        }
        sc.close();
    }
}