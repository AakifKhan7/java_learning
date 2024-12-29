package T3_learning;

public class PB573 {

    void convert(int a){
        if(a == 0){
            return;
        }
        convert(a/2);
        System.out.print(a % 2);
    }
    
    public static void main(String[] args) {
        PB573 ob1 = new PB573();
        ob1.convert(13);
    }
}
