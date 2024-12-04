package T2_programs;
//Armstrong Number
import java.util.*;
class PB318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int current_number = 0;
        int sum = 0;
        int temp = number;

        while(temp > 0){
            current_number = temp % 10;
            temp = temp / 10;
            sum += Math.pow(current_number, 3);
        }

        if(sum == number){
            System.out.println("this is an Armstrong number.");
        }else{
            System.out.println("this is not an Armstrong number.");
        }

        sc.close();
    }
}
