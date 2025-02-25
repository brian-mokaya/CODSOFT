package GuessingGame;


public class GuessingGame {

    public void startGame(){
    //generate a random number between 1 and 100
    int randomNumber = (int)(Math.random() * 100) + 1;

    int attempts = 0;
    boolean GuessedCorrect = false;
    Scanner scanner = new Scanner(System.in);

    system.out.println("Welome to the Guess Game!");
    System.out.println("I have chosen a number between 1 and 100, try to guess it.");

    //loop until correct guess
    while(!GuessedCorrect){
        system.out.println("Enter your guess: ");
        int guess = scanner.nextInt();
        attempts++;

        //compare the guess to the random number
        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts!");
            GuessedCorrect = true;
    }
        else if (guess<randomNumber){
            system.out.println("The number is high than your guess. Try again.");
        }
        else {
            system.out.println("The number is lower than your guess. Try again.");
        }
    }
    scanner.close();
    }
}