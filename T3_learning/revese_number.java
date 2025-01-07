package T3_learning;

class reverse_number {
    
    int reverse(int a){
        if(a == 0){
            return 0;
        }
        return (a % 10) + reverse(a / 10) * 10;
    }

    public static void main(String[] args) {
        reverse_number ob1 = new reverse_number();
        int s = ob1.reverse(325);
        System.out.println(s);
    }
}
