package T2_programs;
import java.util.Scanner;

class PB404 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter size of cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int[][] brr = new int[cols][rows];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Enter elemt at index " + i + ", " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] i: arr){
            for(int j: i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                brr[j][i] = arr[i][j];
            }
        }

        System.out.println("Transposed matrix: ");
        for(int[] i: brr){
            for(int j: i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        sc.close();
    }    
}
