package T3_learning;

public class reverse_number {
    String reverse(int a){
        if(a == 0){
            return "";
        }
        return  (a % 10) + reverse(a / 10);
    }
    
    public static void main(String[] args) {
        reverse_number ob1 = new reverse_number();
        String s = ob1.reverse(325);
        System.out.println(s);
    }
}
