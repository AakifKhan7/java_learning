import java.util.Scanner;

class number_patten {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int count = 1;
        for(int i = 1; i <= rows; i++){
            if(i < rows){
                for(int j = 0; j < i; j++){
                    System.out.print(count + " ");
                    count++;
                }
            }
            else{
                for(int j = count + rows - 1; j >= count; j--){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }    
}
