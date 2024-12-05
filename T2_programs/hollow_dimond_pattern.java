package T2_programs;
import java.util.Scanner;

class hollow_dimond_pattern {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i * 2; j++){
                if(j == (i * 2) - 1 || j == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = rows; i >= 0; i--){
            for(int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            for(int j = i * 2; j >= 0; j--){
                if(j == (i * 2)|| j == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }    
}
