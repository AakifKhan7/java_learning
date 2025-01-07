package T3_learning;

class lcm {

    int lcm_(int a, int b){
        if(b == 0){
            return a;
        }
        return lcm_(b, a % b);
    }
    
    public static void main(String[] args) {
        int a = 24;
        int b = 40;
        lcm ob1 = new lcm();
        int gcd = ob1.lcm_(a, b);
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}
