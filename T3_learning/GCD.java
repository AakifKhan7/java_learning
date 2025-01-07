package T3_learning;

class GCD {

    int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        int a = 24;
        int b = 40;
        GCD ob1 = new GCD();
        System.out.println(ob1.gcd(a, b));
    }
}
