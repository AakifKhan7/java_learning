// write a program to take input age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class Extra23{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int oldest = 0;
        int youngest = 0;

        System.out.print("Enter age of first person: ");
        int a = sc.nextInt();

        System.out.print("Enter age of second person: ");
        int b = sc.nextInt();

        System.out.print("Enter age of third person: ");
        int c = sc.nextInt();

        sc.close();

        if (a > b && a > c){
            oldest = a;
            if ( b > c){
                youngest = c;
            }
            else{
                youngest = b;
            }
            System.out.println(a + " Is maximum");
        }
        else if (b > c){
            oldest = b;
            if ( a > c){
                youngest = c;
            }
            else{
                youngest = a;
            }
            System.out.println(b + " Is maximum");
        }
        else{
            oldest = c;
            if ( b > a){
                youngest = a;
            }
            else{
                youngest = b;
            }
            System.out.println(c + " Is maximu");
        }
        

        System.out.println("Oldest is " + oldest);
        System.out.println("Youngest is "+ youngest);
    }
}