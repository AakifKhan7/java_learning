package T3_learning;

class PB576{
    int a;
    int smallest(int[] arr, int index, int min){
        if(index == arr.length){
            return min;
        }

        if(arr[index] < min){
            min = arr[index];
        }
        return smallest(arr, index + 1, min);
    }

    public static void main(String[] args) {
        PB576 ob1 = new PB576();
        int[] arr = {7, 32, 64, 2, 10, 23};
        System.out.println(ob1.smallest(arr, 0, arr[0]));
    }
}
