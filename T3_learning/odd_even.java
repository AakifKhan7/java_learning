package T3_learning;

class odd_even {
    void odd(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    void even(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        odd_even ob1 = new odd_even();
        ob1.odd(arr);
        System.out.println();
        ob1.even(arr);
    }
}
