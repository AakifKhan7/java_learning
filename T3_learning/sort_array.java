package T3_learning;

class sort_array {
    int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        sort_array ob1 = new sort_array();
        int[] sorted = ob1.sort(arr);
        for(int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}
