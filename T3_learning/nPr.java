package T3_learning;

class nPr {

    int fact(int a){
        if(a == 0){
            return 1;
        }
        return a * fact(a - 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        nPr ob1 = new nPr();
        int result = ob1.fact(n) / ob1.fact(n - r);
        System.out.println(result);
    }
}
