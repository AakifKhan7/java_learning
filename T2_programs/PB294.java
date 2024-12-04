package T2_programs;

import java.util.Scanner;

class PB294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < rows - i; j++){
                System.out.print(j  + i + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
