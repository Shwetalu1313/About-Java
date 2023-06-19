package cody.ex3;

import javax.swing.*;
import java.util.Random;

public class GuessingGame extends Game implements Gussable {
    String[] yesNo = {"Yes", "No"};
    private int randomNum;

    @Override
    void play() {
        int choose = JOptionPane.showOptionDialog(
                null,
                "Do you want to play the game?",
                "Guess Game",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                yesNo,
                yesNo[0]);

        if (choose == 0) {
            randomNum = generateRandomNumber();
            int attempts = 0;
            while (true) {
                int guess = getNumber();
                makeGuess(guess);
                attempts++;

                if (isCorrectGuess()) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed correctly in " + attempts + " attempts.");
                    break;
                }
            }
        } else {
            System.exit(0);
        }
    }

    @Override
    int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(15) + 1;
    }



    @Override
    public boolean isCorrectGuess() {
        return getNumber() == randomNum;
    }

    @Override
    public void makeGuess(int guess) {
        if (guess == randomNum) {
            JOptionPane.showMessageDialog(null, GuessResult.CORRECT);
        } else if (Math.abs(guess - randomNum) <= 5) {
            JOptionPane.showMessageDialog(null, "Possibility is " + GuessResult.HIGH);
        } else {
            JOptionPane.showMessageDialog(null, "Possibility is " + GuessResult.LOW);
        }
    }

    @Override
    int getNumber() {
        while (true) {
            try {
                String guessNumber = JOptionPane.showInputDialog("Guess the number between 1-15");
                if (guessNumber == null) {
                    // User clicked cancel or closed the dialog
                    System.exit(0);
                }
                return Integer.parseInt(guessNumber);
            } catch (NumberFormatException e) {
                // Invalid input, show error message and prompt again
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }



    public static void main(String[] args) {
        GuessingGame gg = new GuessingGame();
        gg.play();
    }
}
