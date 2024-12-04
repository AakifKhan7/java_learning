import java.util.Scanner;

class Palindrome_patterns {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i + (i - 1); j++){
                if(j < i){
                    System.out.print(j + 1);
                }
                else{
                    System.out.print((2*i) - 1 - j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
