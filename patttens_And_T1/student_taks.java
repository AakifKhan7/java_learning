import java.util.Scanner;

class StudentTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student-1 Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Student-1 Surname: ");
        String surname1 = sc.nextLine();

        String fullname1 = "";
        for (int i = 0; i < name1.length(); i++) {
            fullname1 += name1.charAt(i);
        }
        fullname1 += " ";
        for (int i = 0; i < surname1.length(); i++) {
            fullname1 += surname1.charAt(i);
        }

        System.out.println("Student-1 Full Name: " + fullname1);

        System.out.print("Enter number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in the matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    secondMax = max;
                    max = matrix[i][j];
                } else if (matrix[i][j] > secondMax && matrix[i][j] < max) {
                    secondMax = matrix[i][j];
                }
            }
        }
        System.out.println(fullname1 + " Finds the Largest Element from matrix is: " + max);
        System.out.println(fullname1 + " Finds the Second Largest Element from matrix is: " + secondMax);

        sc.nextLine(); // Consume newline
        System.out.print("Enter Student-2 Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Student-2 Surname: ");
        String surname2 = sc.nextLine();

        String fullname2 = name2.concat(" ").concat(surname2);
        System.out.println("Student-2 Full Name: " + fullname2);

        System.out.print("Enter number of rows for the pattern: ");
        int patternRows = sc.nextInt();
        int[][] jaggedArray = new int[patternRows][];

        int counter = 0;
        for (int i = 0; i < patternRows; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                jaggedArray[i][j] = counter++;
            }
        }

        System.out.println(fullname2 + " Prints the pattern as below:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.nextLine(); // Consume newline
        System.out.print("Enter Student-3 Name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter Student-3 Surname: ");
        String surname3 = sc.nextLine();

        String fullname3 = name3 + " " + surname3;
        System.out.println("Student-3 Full Name: " + fullname3);

        System.out.print("Enter a string for toggle case operation: ");
        String inputString = sc.nextLine();
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch);
            }
        }

        System.out.println(fullname3 + " performs toggle case operation:");
        System.out.println(toggledString);

        sc.close();
    }
}
