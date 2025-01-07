package T3_learning;

class find_smallest {

    int findSmallest(int[] arr, int idx, int smallest){
        if(idx == arr.length){
            return smallest;
        }
        if(arr[idx] < smallest){
            smallest = arr[idx];
        }
        return findSmallest(arr, idx + 1, smallest);
    }

    public static void main(String[] args) {
        int[] arr = {63, 2, 34, 90, 10};
        int min = arr[0];
        find_smallest ob1 = new find_smallest();
        int smallest = ob1.findSmallest(arr, 0, min);
        System.out.println(smallest);
    }    
}
