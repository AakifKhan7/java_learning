package T2_programs;

import java.util.Scanner;

class PB321 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        double sum = 0;

        for(int i = 1; i < number; i += 2){
            if(i == 1){
                sum += 1;
            }else{
                sum += (double) i/(i + 2);
            }
        }
        System.out.print(sum);
        sc.close();
    } 
}
