package T3_learning;

public class PB571 {

    int fact(int a){
        if(a == 0){
            return 1;
        }
        return a * fact(a - 1);
    }
    
    public static void main(String[] args) {
        PB571 ob1 = new PB571();
        int result = ob1.fact(5);
        System.out.println(result);
    }
}
