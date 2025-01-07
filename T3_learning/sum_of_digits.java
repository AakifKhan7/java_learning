package T3_learning;

class sum_of_digits {
    int sum(int a){
        if(a == 0){
            return 0;
        }
        return (a % 10) + sum(a / 10);
    }
    
    public static void main(String[] args) {
        int a = 513;
        sum_of_digits ob1 = new sum_of_digits();
        int result = ob1.sum(a);
        System.out.println(result);
    }
}
