package T2_programs;

import java.util.Scanner;

class PB362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }


        int largestOdd = arr[0];
        int largestEven = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largestEven && arr[i] % 2 == 0){
                largestEven = arr[i];
            }
            else if(arr[i] > largestOdd){
                largestOdd = arr[i];
            }
        }

        System.out.println(largestOdd);
        System.out.println(largestEven);
        sc.close();
    }    
}
