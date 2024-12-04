package T2_programs;

import java.util.Scanner;

class PB323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int current_number = 0;
        int sum = 0;
        int temp = number;
        int i = 0;
        
        while(temp > 0){
            temp = temp / 10;
            i++;
        }

        temp = number;
        while(temp > 0){
            current_number = temp % 10;
            temp = temp / 10;
            sum += Math.pow(current_number, i);
            i--;
        }

        if(sum == number){
            System.out.println("This is Disarium Number");
        }
        else{
            System.out.println("This is not Disarium Number");
        }
        sc.close();
    }    
}
