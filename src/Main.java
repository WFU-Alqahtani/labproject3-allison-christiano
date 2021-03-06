import java.util.Scanner;

public class Main {
    // main switchboard
    public void run(){
        System.out.println("Welcome to Blind Man's Bluff");
        boolean play, invalid, guessedHigher = false;
        String response;
        int nWin = 0, nLoss = 0;
        Scanner sc= new Scanner(System.in);
        play = true;
        Card compValue;
        Card userValue;
        //variable to ensure the user does not play more than is in the deck
        int i = 0;
        //creates deck
        Deck deck = new Deck();
        //shuffles deck
        deck.shuffle();
        //updated while loop from starter code to reflect the amount of rounds possible for 1 deck
        while(i <= 25 && play) {
            // assign values to computer and user
            compValue = deck.remove();
            userValue = deck.remove();

            // get user's bet
            System.out.println( "Computer's value is "+ compValue);
            invalid = true;
            while(invalid) {
                System.out.println( "Do you think your number is higher or lower? (H/L)");
                response=sc.next();
                if (response.toUpperCase().charAt(0) == 'H') {
                    // continue playing
                    guessedHigher = true;
                    invalid = false;
                } else if (response.toUpperCase().charAt(0) == 'L') {
                    // break out of while(play) loop
                    guessedHigher = false;
                    invalid = false;
                } else {
                    // invalid response, ask again
                    System.out.println("Invalid response...");
                    invalid = true;
                }
                i++;
            }

            // determine outcome
            CardComparator cardCompare = new CardComparator();
            if((cardCompare.compare(compValue, userValue) < 0 && guessedHigher) || (cardCompare.compare(compValue, userValue) > 0  && !guessedHigher)) {
                System.out.println("Great! You're right:");
                nWin++;
            } else if((cardCompare.compare(compValue, userValue) > 0  && guessedHigher) || (cardCompare.compare(compValue, userValue) < 0  && !guessedHigher)) {
                System.out.println("Sorry, you're wrong:");
                nLoss++;
            }
            System.out.println("your value is "+ userValue);

            // ask user to play again
            invalid = true;
            while(invalid && i <= 25) {
                System.out.println("Play again? (Y/N)");
                response=sc.next();
                if (response.toUpperCase().charAt(0) == 'Y') {
                    // continue playing
                    play = true;
                    invalid = false;
                } else if (response.toUpperCase().charAt(0)=='N') {
                    // break out of while(play) loop
                    play = false;
                    invalid = false;
                } else {
                    // invalid response, ask again
                    System.out.println("Invalid response..." );
                    invalid = true;
                }
            }
        }

        // output stats
        System.out.println("Thanks for playing!");
        System.out.println("Your record was " + nWin + "-" + nLoss + "-" +" (W-L)" );
    }

    public static void main(String[] args) {

        new Main().run();
    }

}
