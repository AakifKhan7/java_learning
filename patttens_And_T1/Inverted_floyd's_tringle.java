import java.util.Scanner;

class Inverted_floyd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = rows; i > 0; i--){
            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
