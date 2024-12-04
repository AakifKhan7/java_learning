import java.util.Scanner;

class CrossWavePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int n_mere_bhai = 1;

        for (int i = 1; i <= rows; i++) {

            int j_ki_value;
            if (i == 1) {
                j_ki_value = rows;
            } else {
                j_ki_value = rows * 2;
            }

            for(int k = 0; k < rows - i+1; k++){
                System.out.print("    ");

            }

            // print space
            for (int j = 1; j <= j_ki_value; j++) {
                
                System.out.printf("%-6d", n_mere_bhai);
                n_mere_bhai++;
            }
            System.out.println();

        }
        sc.close();
    }
}
