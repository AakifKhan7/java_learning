import java.util.Scanner;

class Inverted_pyramid_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = rows; i >= 0; i--){
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
