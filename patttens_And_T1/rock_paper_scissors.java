import java.util.Scanner;

class RockPaperScissors{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int userScore = 0;
        int computerScore = 0;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("Age is invalid, Game ended");
            return;
        }

        System.out.println("Available choice : \n1.Rock \n2. Paper \n3. Scissors");
        System.out.println("Winner based on game's rules: Rock beats Scissors, Paper beats Rock, Scissors beats Paper.");
        System.out.print("Enter your choice(1-3): ");
        int userChoice = sc.nextInt();

        int computerChoice = (int)(Math.random()  * 3) + 1;

        sc.close();

        switch (userChoice) {
            case 1:
                System.out.println("You Choose: Rock");
                break;
            case 2:
                System.out.println("You Choose: Paper");
                break;
            case 3:
                System.out.println("You Choose: Scissors");
                break;
        }

        switch (computerChoice) {
            case 1:
                System.out.println("Computer Choose: Rock");
                break;
            case 2:
                System.out.println("Computer Choose: Paper");
                break;
            case 3:
                System.out.println("Computer Choose Scissors");
                break;
        }

        if(userChoice == 1 && computerChoice == 2){
            computerScore += 1;
        }
        else if(userChoice == 2 && computerChoice == 3){
            computerScore += 1;
        }
        else if(userChoice == 3 && computerChoice == 1){
            computerScore += 1;
        }
        else if(computerChoice == 1 && userChoice == 2){
            userScore += 1;
        }
        else if(computerChoice == 2 && userChoice == 3){
            userScore += 1;
        }
        else if(computerChoice == 3 && userChoice == 1){
            userScore += 1;
        }

        System.out.println("Final Score - " + name + ": "  + userScore + " Computer Score: " + computerScore);

        if(userScore > computerScore){
            System.out.println(name + "wins the game!");
        }
        else if(userScore < computerScore){
            System.out.println("Computer wins the game!");
        }
        else{
            System.out.println("It's a tie game!");
        }
    }
}