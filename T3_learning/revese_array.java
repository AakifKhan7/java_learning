package T3_learning;

class revese_array {
    // reverse element of array using swapping
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 10, 6};
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
