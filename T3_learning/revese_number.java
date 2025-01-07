package T3_learning;

class reverse_number1 {
    
    int reverse(int a, int reversed){
        if(a == 0){
            return reversed;
        }
        reversed = reversed * 10 + (a % 10);
        return reverse(a / 10, reversed);
    }

    public static void main(String[] args) {
        reverse_number1 ob1 = new reverse_number1();
        int s = ob1.reverse(523, 0);
        System.out.println(s);
    }
}
