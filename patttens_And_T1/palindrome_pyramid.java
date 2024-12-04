import java.util.*;
class palindrome_pyramid {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print((char) ('V' + j));
            }
            for (int j = rows - i - 2; j >= 0; j--) {
                System.out.print((char) ('V' + j));
            }
            System.out.println();
        }
        sc.close();
    }
}

