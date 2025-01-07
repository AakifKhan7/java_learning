package T3_learning;

class fib {

    void fibonacci(int n, int a, int b){
        if(n == 0){
            return;
        }
        System.out.print(a + " ");
        fibonacci(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series of first " + n + " numbers is:");
        fib ob1 = new fib();
        ob1.fibonacci(n, 0, 1);
    }    
}
