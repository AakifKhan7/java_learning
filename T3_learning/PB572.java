package T3_learning;

public class PB572 {
    
    int power(int b, int p){
        if(p == 0){
            return 1;
        }
        return b * power(b, p - 1);
    }

    public static void main(String[] args) {
        PB572 ob1 = new PB572();
        int result = ob1.power(2, 4);
        System.out.println(result);
    }
}
