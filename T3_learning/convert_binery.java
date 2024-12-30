package T3_learning;

public class convert_binery {

    int power(int b, int p) {
        if (p == 0) {
            return 1;
        }
        return b * power(b, p - 1);
    }

    int convert(int a, int count, int idx) {
        if (a == 0) {
            return 0;
        }
        int currElement = a % 10;
        int currValue = currElement * power(2, idx);
        return currValue + convert(a / 10, count - 1, idx + 1);
    }

    public static void main(String[] args) {
        convert_binery ob1 = new convert_binery();
        int a = 11011;
        int temp = a;
        int count = 0;
        while(temp/10 != 0){
            count++;
            temp = temp/10;
        }
        int result = ob1.convert(a, count, 0);
        System.out.println(result);
    }
}
