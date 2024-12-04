// write a program to input from user and print cunts of minimum number of notes ((Available notes in Rs.:500, 100, 50, 20, 10, 5, 2, 1 ) require for the amount.
import java.util.Scanner;
class PB239{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        sc.close();

        int remainingAmount = 0;

        int notesOf500 = amount / 500;
        remainingAmount = amount % 500;
        int notesOf100 = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int notesOf50 = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;
        int notesOf20 = remainingAmount / 20;
        remainingAmount = remainingAmount % 20;
        int notesOf10 = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int notesOf5 = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int notesOf1 = remainingAmount;

        System.out.println("The notes is: " + notesOf500 + " of 500 Note " + notesOf100 + " of 100 Note " + notesOf50 + " of 50 Note " + notesOf20 + " of 20 Note " + notesOf10 + " of 10 Note " + notesOf5 + " of 1 Note " + notesOf1 + " of 1 Note");

    }
}