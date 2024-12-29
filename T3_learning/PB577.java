package T3_learning;
public class PB577 {
    void column(int b){
        if(b == 0){
            return;
        }
        System.out.print("* ");
        column(--b);
    }

    void rows(int a){
        if(a == 5){
            return;
        }
        column(a);
        System.out.println();
        rows(a+1);
    }

    public static void main(String []args){
        PB577 ob1 = new PB577();

        ob1.rows(0);
    }
}
