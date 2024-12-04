import java.util.Scanner;

class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square (N): ");
        int n = sc.nextInt();
        int num = 1;

        // Print top row from left to right
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d", num++);
        }
        System.out.println();

        // Print the middle rows with spaces
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.printf("%-3d", num++);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        // Print the bottom row from right to left
        for (int i = n * n; i > num - 1; i--) {
            System.out.printf("%-3d", i);
        }
        System.out.println();

        sc.close();
    }
}
