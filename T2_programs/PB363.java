package T2_programs;

import java.util.Scanner;

class PB363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i: arr){
            System.out.print(i + ", ");
        }
        sc.close();
    }
}
