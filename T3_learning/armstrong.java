package T3_learning;

class armstrong {
    void armstrong_(int a){
        int temp = a;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == a){
            System.out.println("Armstrong number");
        }else{  
            System.out.println("Not an Armstrong number");
        }
    }
    
    public static void main(String[] args) {
        armstrong ob1 = new armstrong();
        int a = 564;
        ob1.armstrong_(a);
        
    }
}
