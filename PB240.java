import java.util.Scanner;
class PB240 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = sc.nextInt();

        sc.close();

        int firstDigit = number / 100;
        int secondDigit = number / 10;
        int thirdDigit = number % 10;

        if (firstDigit >= secondDigit && firstDigit >= thirdDigit) {
            System.out.println("The maximum digit is: " + firstDigit);
        } else if (secondDigit >= firstDigit && secondDigit >= thirdDigit) {
            System.out.println("The maximum digit is: " + secondDigit);
        } else {
            System.out.println("The maximum digit is: " + thirdDigit);
        }

        if ( firstDigit >= 0 && firstDigit <= 5 ){
            int temp = secondDigit;
            secondDigit = firstDigit;
            thirdDigit = temp;
            System.out.println("After swapping second and third digits: " + firstDigit + secondDigit + thirdDigit);
        }

        switch (firstDigit) {
            case 6:
            case 7:
            case 8:
            case 9:
                double average = (firstDigit + secondDigit + thirdDigit) / 3.0;
                System.out.println("The average of the digits is: " + average);
                break;
        }


    }
}
