package DiceGame;

import java.util.Scanner;
import desktop_resources.GUI;
import desktop_fields.Field;

class DiceGame {

    private Player player1;
    private Player player2;
    private int diceThrow1;
    private int diceThrow2;
    private Scanner input = new Scanner(System.in);

    DiceGame() {
        System.out.println("Welcome to Dices.");
        System.out.println("Please write your names for each player.");
        System.out.println("Player 1:");
        player1 = new Player(input.nextLine());
        System.out.println("Player 2:");
        player2 = new Player(input.nextLine());
        while (true) {
            play();
            System.out.println("Play again?");
            System.out.println("Yes - No");
            if (input.nextLine().toLowerCase().equals("no")) {
                break;
            } else {
                play();
            }
        }
        System.out.println("Thank you for playing!");
    }

    private void play() {
        Die dice1 = new Die();
        Die dice2 = new Die();
        Player player = player1;
        int activePlayer = 1;
        while (!win(player)) {
            if (activePlayer == 1) {
                player = player1;
            } else {
                player = player2;
            }
            System.out.println(player.getName()+" is playing.");
            diceThrow1 = dice1.roll();
            diceThrow2 = dice2.roll();
            player.setScore(player.getScore()+(diceThrow1+diceThrow2));
            System.out.println(player.getName()+" rolled: "+diceThrow1+", "+diceThrow2);
            System.out.println(player.getName()+" score is: "+player.getScore());
            if (doubleTurn(player)) {
                System.out.println(player.getName()+" got a pair! Double turn!");
            } else {
                if (activePlayer == 1) {
                    activePlayer = 2;
                } else {
                    activePlayer = 1;
                }
            }
            System.out.println("------------------------------------");
        }
    }

    //Checks if player got a pair and gives another turn.
    private boolean doubleTurn(Player player) {
        if (diceThrow1 == diceThrow2) {
            if (diceThrow1 == 1) {
                player.setScore(0);
            }
            return true;
        } else {
            return false;
        }
    }

    //Checks if active player has a score equal or greater than the requirement score, or if he has double six two times in a row.
    private boolean win(Player player) {
        int winScore = 40;
        return (doubleTurn(player) && player.getLastthrowD1() == 6 && diceThrow1 == 6 || (player.getScore() >= winScore));
    }

    private void updateGUI() {

    }



}
