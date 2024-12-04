import java.util.Scanner;

class Pyramid_numbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
