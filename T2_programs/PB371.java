package T2_programs;

import java.util.Scanner;

class PB371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter Element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter size of 2nd array: ");
        int size2 = sc.nextInt();

        int[] brr = new int[size2];

        for(int i = 0; i < size2; i++){
            System.out.print("Enter Element at index " + i + ": ");
            brr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size2; j++){
                if(arr[i] == brr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        sc.close();
    }
}
