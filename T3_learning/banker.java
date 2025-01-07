package T3_learning;
import java.util.*;
class banker {
    
    public static void main(String[] args) {
        Account ob1 = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of accounts: ");
        int size = sc.nextInt();
        Account[] acc = new Account[size];
        for(int i = 0; i < size; i++){
            acc[i] = new Account();
            System.out.print("Enter the account number: ");
            acc[i].AccountNumber(sc.next());
            System.out.print("Enter the first name: ");
            String f_name = sc.next();
            System.out.print("Enter the middle name: ");
            String middle_name = sc.next();
            System.out.print("Enter the last name: ");
            String l_name = sc.next();
            acc[i].setName(f_name, l_name, middle_name);
            System.out.print("Enter the account balance: ");
            acc[i].setBalance(sc.nextInt());
            System.out.println("Enter the PAN number: ");
            acc[i].setPan(sc.next());

        }

        for(int i = 0; i < acc.length; i++){
            acc[i].printData();
        }
        sc.nextLine();
        System.out.print("Enter account number you want to search: ");
        String account_search = sc.nextLine();
        ob1.search(acc, account_search);
    }
}

class Account{
    Scanner sc = new Scanner(System.in);
    String accountNumber;
    String f_name;
    String l_name;
    String middle_name;
    int account_balance;
    String pan;

    void AccountNumber(String accountNumber) {
        while (true) {
            if (accountNumber.length() != 10) {
                System.out.println("Account number must be exactly 10 digits.");
                System.out.println("Enter Account number: ");
                accountNumber = sc.next();
                continue;
            }
    
            boolean isValid = true;
            for (int i = 0; i < accountNumber.length(); i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    System.out.println("Account number should be numeric.");
                    System.out.println("Enter Account number: ");
                    accountNumber = sc.next();
                    isValid = false;
                    break;
                }
            }
    
            if (!isValid) {
                continue;
            }
    
            this.accountNumber = accountNumber;
            System.out.println("Account number set successfully.");
            break;
        }
    }
    

    void setName(String f_name, String l_name, String middle_name){
        this.f_name = f_name;
        this.l_name = l_name;
        this.middle_name = middle_name;
    }

    void setBalance(int balance){
        this.account_balance = balance;
        while(balance < 5000){
            System.out.println("Initial balance must be more than 5000");
            System.out.println("Enter balance: ");
            balance = sc.nextInt();
        }
    }

    // set pan
    void setPan(String pan){
        this.pan = pan;
        int A_count = 0;
        int N_count = 0;
        if(pan.length() != 10){
            System.out.println("PAN number should be of 10 characters");
            return;
        }
        for(int i = 0; i < pan.length(); i++){
            if(A_count <= 5 && pan.charAt(i) >= 'A' && pan.charAt(i) <= 'Z'){
                A_count++;
            }
            if(i > 4 && i < 9 && (pan.charAt(i) < '0' || pan.charAt(i) > '9')){
                N_count++;
            }
            if(A_count > 4){
                System.out.println("First 5 characters of PAN should be alphabets");
                return;
            }
            if(N_count < 4){
                System.out.println("Last 4 characters of PAN should be numeric");
                return;
            }
            if(i == 9 && (pan.charAt(i) < 'A' || pan.charAt(i) > 'Z')){
                System.out.println("Last character of PAN should be alphabet");
                return;
            }
        }
    }

    void search(Account[] arr, String serach_id){
        for(int i = 0; i < arr.length; i++){
            if(serach_id == arr[i].accountNumber){
                arr[i].printData();
            }
        }
    }

    void printData(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + f_name + " " + middle_name + " " + l_name);
        System.out.println("Account Balance: " + account_balance);
        System.out.println("PAN: " + pan);
    }
}
