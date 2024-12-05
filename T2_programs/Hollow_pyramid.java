import java.util.Scanner;

class Hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i * 2; j++){
                if(j == (i * 2) - 1|| j == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                if((i == rows - 1)){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }    
}
