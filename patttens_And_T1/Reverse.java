import java.util.Scanner;
class Reverse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = rows; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
